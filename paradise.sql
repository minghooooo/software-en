/*
Navicat MySQL Data Transfer

Source Server         : tmh
Source Server Version : 50561
Source Host           : 127.0.0.1:3306
Source Database       : paradise

Target Server Type    : MYSQL
Target Server Version : 50561
File Encoding         : 65001

Date: 2019-12-15 03:23:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for card
-- ----------------------------
DROP TABLE IF EXISTS `card`;
CREATE TABLE `card` (
  `number` varchar(50) NOT NULL,
  `color` varchar(50) NOT NULL,
  `count` int(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of card
-- ----------------------------
INSERT INTO `card` VALUES ('1', 'Diamond', null);
INSERT INTO `card` VALUES ('1', 'Club', null);
INSERT INTO `card` VALUES ('1', 'Heart', null);
INSERT INTO `card` VALUES ('1', 'Spade', null);
INSERT INTO `card` VALUES ('2', 'Diamond', null);
INSERT INTO `card` VALUES ('2', 'Club', null);
INSERT INTO `card` VALUES ('2', 'Heart', null);
INSERT INTO `card` VALUES ('2', 'Spade', null);
INSERT INTO `card` VALUES ('3', 'Diamond', null);
INSERT INTO `card` VALUES ('3', 'Club', null);
INSERT INTO `card` VALUES ('3', 'Heart', null);
INSERT INTO `card` VALUES ('3', 'Spade', null);
INSERT INTO `card` VALUES ('4', 'Diamond', null);
INSERT INTO `card` VALUES ('4', 'Club', null);
INSERT INTO `card` VALUES ('4', 'Heart', null);
INSERT INTO `card` VALUES ('4', 'Spade', null);
INSERT INTO `card` VALUES ('5', 'Diamond', null);
INSERT INTO `card` VALUES ('5', 'Club', null);
INSERT INTO `card` VALUES ('5', 'Heart', null);
INSERT INTO `card` VALUES ('5', 'Spade', null);
INSERT INTO `card` VALUES ('6', 'Diamond', null);
INSERT INTO `card` VALUES ('6', 'Club', null);
INSERT INTO `card` VALUES ('6', 'Heart', null);
INSERT INTO `card` VALUES ('6', 'Spade', null);
INSERT INTO `card` VALUES ('7', 'Diamond', null);
INSERT INTO `card` VALUES ('7', 'Club', null);
INSERT INTO `card` VALUES ('7', 'Heart', null);
INSERT INTO `card` VALUES ('7', 'Spade', null);
INSERT INTO `card` VALUES ('8', 'Diamond', null);
INSERT INTO `card` VALUES ('8', 'Club', null);
INSERT INTO `card` VALUES ('8', 'Heart', null);
INSERT INTO `card` VALUES ('8', 'Spade', null);
INSERT INTO `card` VALUES ('9', 'Diamond', null);
INSERT INTO `card` VALUES ('9', 'Club', null);
INSERT INTO `card` VALUES ('9', 'Heart', null);
INSERT INTO `card` VALUES ('9', 'Spade', null);
INSERT INTO `card` VALUES ('10', 'Diamond', null);
INSERT INTO `card` VALUES ('10', 'Club', null);
INSERT INTO `card` VALUES ('10', 'Heart', null);
INSERT INTO `card` VALUES ('10', 'Spade', null);
INSERT INTO `card` VALUES ('12', 'Diamond', null);
INSERT INTO `card` VALUES ('12', 'Club', null);
INSERT INTO `card` VALUES ('11', 'Heart', null);
INSERT INTO `card` VALUES ('11', 'Spade', null);
INSERT INTO `card` VALUES ('11', 'Diamond', null);
INSERT INTO `card` VALUES ('11', 'Club', null);
INSERT INTO `card` VALUES ('12', 'Heart', null);
INSERT INTO `card` VALUES ('12', 'Spade', null);
INSERT INTO `card` VALUES ('13', 'Diamond', null);
INSERT INTO `card` VALUES ('13', 'Club', null);
INSERT INTO `card` VALUES ('13', 'Heart', null);
INSERT INTO `card` VALUES ('13', 'Spade', null);

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `cname` varchar(50) NOT NULL,
  `inven` int(50) NOT NULL,
  `cp` int(50) NOT NULL,
  `cid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES ('皮卡丘', '0', '1000', '1');
INSERT INTO `commodity` VALUES ('可达鸭', '4', '1500', '2');
INSERT INTO `commodity` VALUES ('呆呆兽', '6', '2000', '3');
INSERT INTO `commodity` VALUES ('波克比', '8', '2500', '4');
INSERT INTO `commodity` VALUES ('胖丁', '10', '3000', '5');
INSERT INTO `commodity` VALUES ('喵喵', '3', '3500', '6');
INSERT INTO `commodity` VALUES ('伊布', '5', '4000', '7');
INSERT INTO `commodity` VALUES ('梦幻', '7', '5000', '8');
INSERT INTO `commodity` VALUES ('超梦', '9', '6000', '9');

-- ----------------------------
-- Table structure for hourse
-- ----------------------------
DROP TABLE IF EXISTS `hourse`;
CREATE TABLE `hourse` (
  `hname` varchar(50) NOT NULL,
  `hnumber` int(50) NOT NULL,
  `rank` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hourse
-- ----------------------------
INSERT INTO `hourse` VALUES ('赤兔', '1', '');
INSERT INTO `hourse` VALUES ('的卢', '2', '');
INSERT INTO `hourse` VALUES ('乌骓', '3', '');
INSERT INTO `hourse` VALUES ('绝影', '4', '');
INSERT INTO `hourse` VALUES ('飒露紫', '5', '');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uname` varchar(50) NOT NULL,
  `uid` int(10) NOT NULL,
  `upoint` int(255) NOT NULL,
  `upw` varchar(50) NOT NULL,
  `i1` varchar(255) DEFAULT NULL,
  `inumber1` int(50) DEFAULT NULL,
  `i2` varchar(255) DEFAULT NULL,
  `inumber2` int(11) DEFAULT NULL,
  `i3` varchar(255) DEFAULT NULL,
  `inumber3` int(11) DEFAULT NULL,
  `i4` varchar(255) DEFAULT NULL,
  `inumber4` int(11) DEFAULT NULL,
  `i5` varchar(255) DEFAULT NULL,
  `inumber5` int(11) DEFAULT NULL,
  `i6` varchar(255) DEFAULT NULL,
  `inumber6` int(11) DEFAULT NULL,
  `win` int(11) NOT NULL,
  `lose` int(11) NOT NULL,
  `draw` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('tmh', '123', '6643', '123', '九折卷', '63', '八折卷', '0', '七折卷', '0', '六折卷', '1', '五折卷', '0', '四折卷', '0', '4', '8', '3');
INSERT INTO `user` VALUES ('lzl', '678', '0', '678', null, null, null, null, null, null, null, null, null, null, null, null, '0', '0', '0');
INSERT INTO `user` VALUES ('lh', '567', '0', '567', null, null, null, null, null, null, null, null, null, null, null, null, '0', '0', '0');
INSERT INTO `user` VALUES ('wbh', '456', '0', '456', null, null, null, null, null, null, null, null, null, null, null, null, '0', '0', '0');
INSERT INTO `user` VALUES ('fzf', '345', '0', '345', null, null, null, null, null, null, null, null, null, null, null, null, '0', '0', '0');
INSERT INTO `user` VALUES ('zy', '234', '0', '234', null, null, null, null, null, null, null, null, null, null, null, null, '0', '0', '0');
