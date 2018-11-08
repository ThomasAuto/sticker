//index.js
//获取应用实例
const app = getApp()
Page({
  data: {
    motto: 'Hello World',
    userInfo: {},
    hasUserInfo: false,
    canIUse: false,
    msg: "",
    showModel: app.globalData.canIUse,
    openId: "",
    toView: 'red',
    scrollTop: 100,
    recordDayVOS: {},
    cost: "",
    showModal: false,
    inputMoney: 0,
    inputContent: "",
    nowMonth: "",
    income: "",
    userRecordFlag: true,
    userCenterFlag: false,
    colorFlag: true,
    outFlag: true
  },
  //事件处理函数
  bindViewTap: function() {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onLoad: function () {
    var that = this;
    // 存储是否授权变量，来展示是否登录
    // 同步获取本地信息（wx.getStorage 为异步获取，有坑，console.log(this.data.userInfo)时，数据还没赋值成功，此时为{}）
    try {
      var value = wx.getStorageSync('userInfo')
      if (value) {
        console.log(value)
        that.setData({
          userInfo: value
        })
      }
    } catch (e) {
      // console.log('获取用户授权信息失败');
      wx.redirectTo({
        url: '../login/login'
      })
    }

    // 再次判断用户信息
    console.log("获取用户信息")
    if(that.data.userInfo.id === undefined){
      console.log('xxxx')
      wx.redirectTo({
        url: '../login/login'
      })
    }

    // 请求用户数据
    this.getUserRecord();
  },
  // 获取用户记录
  getUserRecord: function(e) {
    console.log('获取用户记录')
    var that = this
    wx.request({
      url: 'https://www.xiaoyanol.cn/sticker/sticker/sticker/record',
      method: 'POST',
      data: {
        "openId": that.data.userInfo.openId,
        "id": that.data.userInfo.id
      },
      success: function(res) {
        if(res.data.data === ""){
          return;
        }
        that.changeTimeStamp(res.data.data.recordDayVOS, that)
        that.setData({
          recordDayVOS: res.data.data.recordDayVOS,
          cost: res.data.data.cost,
          income: res.data.data.income
        })
        console.log(that)
        console.log('xxx1')
        console.log(that)
      }
    })
  },


  upper: function (e) {
    console.log('xx1')
    this.getUserRecord();
  },
  lower: function (e) {
    console.log('xx2')
  },
  scroll: function (e) {
  },
  tap: function (e) {
    for (var i = 0; i < order.length; ++i) {
      console.log(order[i])
      if (order[i] === this.data.toView) {
        this.setData({
          toView: order[i + 1]
        })
        break
      }
    }
  },
  tapMove: function (e) {
    this.setData({
      scrollTop: this.data.scrollTop + 10
    })
  },

  // 时间戳日期转换
  fmtDate : function (obj) {
    var date = new Date(obj);
    var dd = ""

    switch(date.getDay()) {
      case 0:
        dd = '星期天'
        break;
      case 1:
        dd = '星期一'
        break;
      case 2:
        dd = '星期二'
        break;
      case 3:
        dd = '星期三'
        break;
      case 4:
        dd = '星期四'
        break;
      case 5:
        dd = '星期五'
        break;
      case 6:
        dd = '星期六'
        break;
    }
    var y = 1900 + date.getYear();
    var m = "0" + (date.getMonth() + 1);
    var d = "0" + date.getDate();
    return y + "/" + m.substring(m.length - 2, m.length) + "/" + d.substring(d.length - 2, d.length) + ' '+ dd;
  },

  changeTimeStamp :  function(obj, that) {
    console.log('xxx')
    console.log(obj)
    for (var i = 0; i < obj.length; i++) {
    
      obj[i].time = this.fmtDate(obj[i].time)
    }
    var month  = new Date().getMonth()+1;
    that.setData({
      nowMonth: month
    }) 
  },

  //按钮跳转
  addOne : function() {
    wx.navigateTo({
      url: '../add/add'
    })
  },

  /**
 * 弹窗
 */
  showDialogBtn: function () {
    this.setData({
      showModal: true
    })
  },
  /**
   * 弹出框蒙层截断touchmove事件
   */
  preventTouchMove: function () {
  },
  /**
   * 隐藏模态对话框
   */
  hideModal: function () {
    this.setData({
      showModal: false
    });
  },
  /**
   * 对话框取消按钮点击事件
   */
  onCancel: function () {
    this.hideModal();
    console.log('取消')
  },
  /**
   * 对话框确认按钮点击事件
   */
  onConfirm: function () {
    this.hideModal();
    console.log('确定')
    var that = this;
    wx.request({
      method: "post",
      url: 'https://www.xiaoyanol.cn/sticker/sticker/sticker/add',
      data: {
        userId: that.data.userInfo.id,
        amount: that.data.inputMoney,
        content: that.data.inputContent,
        outFlag: that.data.outFlag
      },
      success: function (res) {
        console.log('请求成功')
        console.log(res.data.data)
        that.setData({
          inputMoney: 0,
          inoutContent: ""
        })
        that.getUserRecord()

      },
      fail: function (res) {
        console.log('请求失败')
        console.log(res)
      }
    })
  },
  inputMoney: function(e){
    this.setData({
      inputMoney: e.detail.value
    })
  },

  inputContent: function(e){
    this.setData({
      inputContent: e.detail.value
    })
  },

  userRecordSwitch: function(){
    this.setData({
      userRecordFlag: true,
      userCenterFlag: false,
      colorFlag: true
    })
    console.log(this)
  },

  userCenterSwitch: function () {
    console.log('zzz')
    this.setData({
      userRecordFlag: false,
      userCenterFlag: true,
      colorFlag: false
    })
    console.log(this)
  },

  outFlagSwitch: function(){
    this.setData({
      outFlag: !this.data.outFlag
    })
  }
})
