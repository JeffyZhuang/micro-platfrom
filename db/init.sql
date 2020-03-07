DROP TABLE IF EXISTS `t_system_user`;

CREATE TABLE `t_system_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_code` varchar(64) NOT NULL COMMENT '用户编号',
  `user_name` varchar(200) NOT NULL COMMENT '用户名',
  `account` varchar(200) NOT NULL COMMENT '账号',
  `password` varchar(50) NOT NULL COMMENT '密码加密串',
  `salt` varchar(64) NOT NULL COMMENT '盐值',
  `telephone` varchar(50) NOT NULL COMMENT '手机号码',
  `status` varchar(2) NOT NULL DEFAULT '0' COMMENT '是否激活',
  `disabled` varchar(2) NOT NULL DEFAULT '1' COMMENT '有效、失效',
  `created_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `created_by` varchar(64) COMMENT '创建人' ,
  `updated_by` varchar(64) COMMENT '更新人' ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '用户表';


DROP TABLE IF EXISTS `t_system_role`;

CREATE TABLE `t_system_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `role_code` varchar(64) NOT NULL COMMENT '角色code',
  `role_name` varchar(200) NOT NULL COMMENT '角色名',
  `intro` varchar(255) COMMENT '简介',
  `disabled` varchar(2) NOT NULL DEFAULT '1' COMMENT '有效、失效',
  `created_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `created_by` varchar(64) COMMENT '创建人' ,
  `updated_by` varchar(64) COMMENT '更新人' ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '角色表';


DROP TABLE IF EXISTS `t_system_resources`;

CREATE TABLE `t_system_resources` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `resource_code` varchar(64) NOT NULL COMMENT '资源code',
  `resource_name` varchar(200) NOT NULL COMMENT '资源名',
  `intro` varchar(255) COMMENT '简介',
  `icon` varchar(64) COMMENT '图标',
  `parent_code` varchar(64) NOT NULL COMMENT '上级菜单code',
  `order_seq` int(11) NOT NULL DEFAULT 0 COMMENT '排序',
  `disabled` varchar(2) NOT NULL DEFAULT '1' COMMENT '有效、失效',
  `created_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `created_by` varchar(64) COMMENT '创建人' ,
  `updated_by` varchar(64) COMMENT '更新人' ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '资源表';


DROP TABLE IF EXISTS `t_system_permission`;

CREATE TABLE `t_system_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `permission_code` varchar(64) NOT NULL COMMENT '权限code',
  `path` varchar(255) NOT NULL COMMENT '权限路径',
  `intro` varchar(255) COMMENT '简介',
  `disabled` varchar(2) NOT NULL DEFAULT '1' COMMENT '有效、失效',
  `created_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `created_by` varchar(64) COMMENT '创建人' ,
  `updated_by` varchar(64) COMMENT '更新人' ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '权限表';

DROP TABLE IF EXISTS `t_system_user_role`;
CREATE TABLE `t_system_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_code` varchar(64) NOT NULL COMMENT '用户code',
  `role_code` varchar(64) NOT NULL COMMENT '角色code',
  `created_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `created_by` varchar(64) COMMENT '创建人' ,
  `updated_by` varchar(64) COMMENT '更新人' ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '用户角色表';

DROP TABLE IF EXISTS `t_system_role_resources`;
CREATE TABLE `t_system_role_resources` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `role_code` varchar(64) NOT NULL COMMENT '角色code',
  `resource_code` varchar(64) NOT NULL COMMENT '资源code',
  `created_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `created_by` varchar(64) COMMENT '创建人' ,
  `updated_by` varchar(64) COMMENT '更新人' ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '角色资源表';


DROP TABLE IF EXISTS `t_system_resources_permission`;
CREATE TABLE `t_system_resources_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `resource_code` varchar(64) NOT NULL COMMENT '资源code',
  `permissiom_code` varchar(64) NOT NULL COMMENT '权限code',
  `created_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `created_by` varchar(64) COMMENT '创建人' ,
  `updated_by` varchar(64) COMMENT '更新人' ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '资源权限表';