CREATE TABLE `sticker_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sticker_id` int(11) NOT NULL DEFAULT '0' COMMENT '贴纸Id',
  `account` int(11) NOT NULL DEFAULT '0' COMMENT '花费',
  `remark` varchar(64) NOT NULL DEFAULT '0' COMMENT '备注',
  `ctime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `utime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` int(2) NOT NULL DEFAULT '1' COMMENT '是否有效 0- 无效， 1-有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账目表';


CREATE TABLE `sticker_quota` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(11) NOT NULL DEFAULT '0' COMMENT '用户Id',
  `month_quota` int(11) NOT NULL DEFAULT '0' COMMENT '每月额度',
  `times` int(11) NOT NULL DEFAULT '1' COMMENT '修改次数',
  `month` int(11) NOT NULL DEFAULT '0' COMMENT '月份',
  `year` int(11) NOT NULL DEFAULT '1' COMMENT '年份',
  `ctime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `utime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` int(2) NOT NULL DEFAULT '1' COMMENT '是否有效 0- 无效， 1-有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='每月额度表';


CREATE TABLE `sticker_sticker` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(11) NOT NULL DEFAULT '0' COMMENT '用户Id',
  `happy_url` varchar(128) NOT NULL DEFAULT '' COMMENT '趣图',
  `amount` int(11) NOT NULL DEFAULT '0' COMMENT '花费',
  `content` varchar(128) NOT NULL DEFAULT '' COMMENT '使用途径',
  `used_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '使用时间',
  `ctime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `utime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` int(2) NOT NULL DEFAULT '1' COMMENT '是否有效 0- 无效， 1-有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='贴纸表';


CREATE TABLE `sticker_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `open_id` varchar(64) NOT NULL DEFAULT '' COMMENT '微信的openId',
  `nick_name` varchar(64) NOT NULL DEFAULT '' COMMENT '微信用户名',
  `gender` int(2) NOT NULL DEFAULT '1' COMMENT '性别 1 - 男， 2-女',
  `avatar_url` varchar(256) NOT NULL DEFAULT '' COMMENT '微信头像URL',
  `city` varchar(32) NOT NULL DEFAULT '' COMMENT '城市',
  `province` varchar(32) NOT NULL DEFAULT '' COMMENT '省份',
  `mobile` varchar(16) NOT NULL DEFAULT '' COMMENT '手机号',
  `email` varchar(128) NOT NULL DEFAULT '' COMMENT '邮箱',
  `ctime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `utime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` int(2) NOT NULL DEFAULT '1' COMMENT '是否有效 0- 无效， 1-有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE `sticker_visit` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(11) NOT NULL DEFAULT '0' COMMENT '用户Id',
  `ip` varchar(64) NOT NULL DEFAULT '' COMMENT '登录IP',
  `phone_model` varchar(64) NOT NULL DEFAULT '' COMMENT '手机型号',
  `wx_version` varchar(64) NOT NULL DEFAULT '' COMMENT '微信版本号',
  `ctime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` int(2) NOT NULL DEFAULT '1' COMMENT '是否有效 0- 无效， 1-有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='访问表';