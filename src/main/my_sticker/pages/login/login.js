// pages/login/login.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    userInfo: {}
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },

  // begin getUserInfo
  getUserInfo: function(result){
    var that = this;
    if(result.detail.rawData == undefined) {
      // 获取用户信息失败
      wx.showModal({
        title: '提示',
        content: '授权失败，无法使用',
        success(res) {
          if (res.confirm) {
            console.log('用户点击确定')
          } else if (res.cancel) {
            console.log('用户点击取消')
          }
        }
      })
      return;
    }

    // 获取用户信息成功
    // 1、获取用户信息成功，暂存
    // 2、获取openId，暂存
    // 3、用户登录（未注册的，进行注册，并返回登录后用户信息）
    // 4、本地存储用户信息
    // 5、跳转使用界面

    console.log(result.detail.userInfo)
    // 暂存用户信息
    that.setData({
      userInfo : result.detail.userInfo
    })
    // 打印信息
    console.log(that)

    // 获取openId
    var that = this;
    wx.login({
      success: function (res) {
        console.log(that)
        if (res.code) {
          //发起网络请求
          wx.request({
            method: "post",
            url: 'https://www.xiaoyanol.cn/sticker/sticker/user/login',
            data: {
              avatarUrl: that.data.userInfo.avatarUrl,
              city: that.data.userInfo.city,
              country: that.data.userInfo.country,
              gender: that.data.userInfo.gender,
              nickName: that.data.userInfo.nickName,
              province: that.data.userInfo.province,
              code: res.code
            },
            success: function (res) {
              console.log('请求成功')
              console.log(res.data.data)
              // 存储用户登录信息
              if (res.data.data == null) {
                wx.showModal({
                  title: '提示',
                  content: '授权失败，无法使用，请重新授权',
                  success(res) {
                    if (res.confirm) {
                      console.log('用户点击确定')
                    } else if (res.cancel) {
                      console.log('用户点击取消')
                    }
                  }
                })
              }
              try {
                wx.setStorageSync('userInfo', res.data.data)
                that.gotoIndex()
              } catch (e) { }
              
            },
            fail: function(res) {
              console.log('请求失败')
              console.log(res)
            }
          })
        } else {
          console.log('获取用户登录态失败！' + res.errMsg)
        }
      }
    });
  },
  gotoIndex: function () {
    //重定向页面
    console.log('xxxssss')
    wx.redirectTo({
      url: '../index/index?user_id=111'　　// 页面 A
    })
  }
  // end getUserInfo

})