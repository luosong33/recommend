CREATE TABLE `real_time_rules` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '',
  `preference` varchar(20) NOT NULL COMMENT '喜好阈值',
  `interested` varchar(20) NOT NULL COMMENT '感兴趣阈值',
  `may_interested` varchar(20) NOT NULL COMMENT '可能感兴趣阈值',
  `created` datetime NOT NULL COMMENT '创建时间',
  `updated` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='实时规则表';
INSERT INTO `real_time_rules` (`id`, `preference`, `interested`, `may_interested`, `created`, `updated`)
VALUES
  (1, '3', '2', 1, '2019-05-16 10:06:00', '2019-05-16 10:06:00'),
  (2, '5', '3', 2, '2019-05-16 10:06:00', '2019-05-16 10:06:00');



CREATE TABLE `label` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '',
  `label_classify` varchar(20) NOT NULL COMMENT '标签分类',
  `label_name` varchar(20) NOT NULL COMMENT '标签名称',
  `created` datetime NOT NULL COMMENT '创建时间',
  `updated` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='标签表';
INSERT INTO `label` (`id`, `label_classify`, `label_name`, `created`, `updated`)
VALUES
  (1, '基本属性', '身高', '2019-05-16 10:09:11', '2019-05-16 10:09:11'),
  (2, '基本属性', '年龄', '2019-05-16 10:09:11', '2019-05-16 10:09:11');