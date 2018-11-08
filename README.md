# 简介
为了方便自己记账所做的一款小程序。边写边查（没有接触过），磕磕碰碰，花了两天时间弄出来了，很简陋，但是基本满足自己的需求了（记账），以后有需要再完善一下。

# 小程序源码
my_sticker文件夹，主要用到两个页面，login,index。

# SQL
resources文件夹中

# 运行
有两个命令行参数
```Shell
BUILD_ID=DONTKILLME
pid=`ps -ef | grep "sticker-0.0.1-SNAPSHOT.jar" | grep -v grep | awk '{print $2}'`
who
echo $pid current-------

if [ "$pid" == "" ]
then
    echo "first star.......t"
else
	kill 9 $pid
fi

echo ____________
pwd
cd target
ls
java -jar -Dspring.profiles.active=dev -DappId=test -Dsecret=test sticker-0.0.1-SNAPSHOT.jar&
```
