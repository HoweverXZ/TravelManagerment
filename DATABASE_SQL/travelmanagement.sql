/*
 Navicat MySQL Data Transfer

 Source Server         : Project
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : travelmanagement

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 24/06/2021 09:33:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tour_packages
-- ----------------------------
CREATE DATABASE IF NOT EXISTS travelmanagement;
USE travelmanagement;
DROP TABLE IF EXISTS `tour_packages`;
CREATE TABLE `tour_packages`  (
  `package_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `package_code` int NOT NULL,
  `country` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `no_of_days` int NOT NULL,
  `itinerary` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`package_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tour_packages
-- ----------------------------
INSERT INTO `tour_packages` VALUES ('666', 100, 'Chinese', 6, '[Asia, America]');
INSERT INTO `tour_packages` VALUES ('999', 100, 'Chinese', 9, '[Asia, Europe, North, America, Europe, Africa, Oceania, Antarctica]');
INSERT INTO `tour_packages` VALUES ('Dongbei', 100, 'British', 7, 'Africa');
INSERT INTO `tour_packages` VALUES ('Dongbei66', 100, 'British', 7, 'Asia');
INSERT INTO `tour_packages` VALUES ('Package9', 100, 'Japan', 7, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 0', 0, 'Chinese', 0, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 1', 1, 'American', 1, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 10', 10, 'German', 3, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 100', 100, 'German', 2, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 101', 101, 'Russia', 3, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 102', 102, 'Chinese', 4, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 103', 103, 'American', 5, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 104', 104, 'British', 6, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 105', 105, 'Japan', 0, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 106', 106, 'German', 1, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 107', 107, 'Russia', 2, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 108', 108, 'Chinese', 3, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 109', 109, 'American', 4, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 11', 11, 'Russia', 4, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 110', 110, 'British', 5, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 111', 111, 'Japan', 6, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 112', 112, 'German', 0, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 113', 113, 'Russia', 1, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 114', 114, 'Chinese', 2, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 115', 115, 'American', 3, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 116', 116, 'British', 4, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 117', 117, 'Japan', 5, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 118', 118, 'German', 6, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 119', 119, 'Russia', 0, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 12', 12, 'Chinese', 5, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 120', 120, 'Chinese', 1, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 121', 121, 'American', 2, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 122', 122, 'British', 3, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 123', 123, 'Japan', 4, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 124', 124, 'German', 5, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 125', 125, 'Russia', 6, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 126', 126, 'Chinese', 0, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 127', 127, 'American', 1, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 128', 128, 'British', 2, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 129', 129, 'Japan', 3, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 13', 13, 'American', 6, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 130', 130, 'German', 4, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 131', 131, 'Russia', 5, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 132', 132, 'Chinese', 6, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 133', 133, 'American', 0, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 134', 134, 'British', 1, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 135', 135, 'Japan', 2, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 136', 136, 'German', 3, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 137', 137, 'Russia', 4, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 138', 138, 'Chinese', 5, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 139', 139, 'American', 6, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 14', 14, 'British', 0, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 140', 140, 'British', 0, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 141', 141, 'Japan', 1, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 142', 142, 'German', 2, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 143', 143, 'Russia', 3, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 144', 144, 'Chinese', 4, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 145', 145, 'American', 5, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 146', 146, 'British', 6, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 147', 147, 'Japan', 0, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 148', 148, 'German', 1, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 149', 149, 'Russia', 2, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 15', 15, 'Japan', 1, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 150', 150, 'Chinese', 3, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 151', 151, 'American', 4, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 152', 152, 'British', 5, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 153', 153, 'Japan', 6, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 154', 154, 'German', 0, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 155', 155, 'Russia', 1, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 156', 156, 'Chinese', 2, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 157', 157, 'American', 3, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 158', 158, 'British', 4, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 159', 159, 'Japan', 5, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 16', 16, 'German', 2, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 160', 160, 'German', 6, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 161', 161, 'Russia', 0, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 162', 162, 'Chinese', 1, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 163', 163, 'American', 2, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 164', 164, 'British', 3, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 165', 165, 'Japan', 4, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 166', 166, 'German', 5, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 167', 167, 'Russia', 6, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 168', 168, 'Chinese', 0, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 169', 169, 'American', 1, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 17', 17, 'Russia', 3, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 170', 170, 'British', 2, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 171', 171, 'Japan', 3, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 172', 172, 'German', 4, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 173', 173, 'Russia', 5, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 174', 174, 'Chinese', 6, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 175', 175, 'American', 0, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 176', 176, 'British', 1, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 177', 177, 'Japan', 2, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 178', 178, 'German', 3, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 179', 179, 'Russia', 4, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 18', 18, 'Chinese', 4, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 180', 180, 'Chinese', 5, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 181', 181, 'American', 6, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 182', 182, 'British', 0, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 183', 183, 'Japan', 1, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 184', 184, 'German', 2, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 185', 185, 'Russia', 3, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 186', 186, 'Chinese', 4, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 187', 187, 'American', 5, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 188', 188, 'British', 6, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 189', 189, 'Japan', 0, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 19', 19, 'American', 5, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 190', 190, 'German', 1, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 191', 191, 'Russia', 2, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 192', 192, 'Chinese', 3, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 193', 193, 'American', 4, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 194', 194, 'British', 5, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 195', 195, 'Japan', 6, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 196', 196, 'German', 0, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 197', 197, 'Russia', 1, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 198', 198, 'Chinese', 2, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 199', 199, 'American', 3, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 2', 2, 'British', 2, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 20', 20, 'British', 6, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 21', 21, 'Japan', 0, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 22', 22, 'German', 1, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 23', 23, 'Russia', 2, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 24', 24, 'Chinese', 3, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 25', 25, 'American', 4, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 26', 26, 'British', 5, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 27', 27, 'Japan', 6, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 28', 28, 'German', 0, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 29', 29, 'Russia', 1, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 3', 3, 'Japan', 3, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 30', 30, 'Chinese', 2, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 31', 31, 'American', 3, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 32', 32, 'British', 4, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 33', 33, 'Japan', 5, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 34', 34, 'German', 6, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 35', 35, 'Russia', 0, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 36', 36, 'Chinese', 1, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 37', 37, 'American', 2, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 38', 38, 'British', 3, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 39', 39, 'Japan', 4, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 4', 4, 'German', 4, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 40', 40, 'German', 5, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 41', 41, 'Russia', 6, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 42', 42, 'Chinese', 0, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 43', 43, 'American', 1, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 44', 44, 'British', 2, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 45', 45, 'Japan', 3, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 46', 46, 'German', 4, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 47', 47, 'Russia', 5, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 48', 48, 'Chinese', 6, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 49', 49, 'American', 0, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 5', 5, 'Russia', 5, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 50', 50, 'British', 1, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 51', 51, 'Japan', 2, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 52', 52, 'German', 3, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 53', 53, 'Russia', 4, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 54', 54, 'Chinese', 5, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 55', 55, 'American', 6, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 56', 56, 'British', 0, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 57', 57, 'Japan', 1, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 58', 58, 'German', 2, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 59', 59, 'Russia', 3, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 6', 6, 'Chinese', 6, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 60', 60, 'Chinese', 4, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 61', 61, 'American', 5, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 62', 62, 'British', 6, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 63', 63, 'Japan', 0, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 64', 64, 'German', 1, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 65', 65, 'Russia', 2, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 66', 66, 'Chinese', 3, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 67', 67, 'American', 4, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 68', 68, 'British', 5, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 69', 69, 'Japan', 6, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 7', 7, 'American', 0, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 70', 70, 'German', 0, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 71', 71, 'Russia', 1, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 72', 72, 'Chinese', 2, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 73', 73, 'American', 3, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 74', 74, 'British', 4, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 75', 75, 'Japan', 5, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 76', 76, 'German', 6, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 77', 77, 'Russia', 0, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 78', 78, 'Chinese', 1, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 79', 79, 'American', 2, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 8', 8, 'British', 1, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 80', 80, 'British', 3, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 81', 81, 'Japan', 4, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 82', 82, 'German', 5, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 83', 83, 'Russia', 6, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 84', 84, 'Chinese', 0, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 85', 85, 'American', 1, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 86', 86, 'British', 2, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 87', 87, 'Japan', 3, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 88', 88, 'German', 4, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 89', 89, 'Russia', 5, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 9', 9, 'Japan', 2, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 90', 90, 'Chinese', 6, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 91', 91, 'American', 0, 'America');
INSERT INTO `tour_packages` VALUES ('Packages 92', 92, 'British', 1, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 93', 93, 'Japan', 2, 'Africa');
INSERT INTO `tour_packages` VALUES ('Packages 94', 94, 'German', 3, 'Oceania');
INSERT INTO `tour_packages` VALUES ('Packages 95', 95, 'Russia', 4, 'Antarctica');
INSERT INTO `tour_packages` VALUES ('Packages 96', 96, 'Chinese', 5, 'Asia');
INSERT INTO `tour_packages` VALUES ('Packages 97', 97, 'American', 6, 'Europe');
INSERT INTO `tour_packages` VALUES ('Packages 98', 98, 'British', 0, 'North');
INSERT INTO `tour_packages` VALUES ('Packages 99', 99, 'Japan', 1, 'America');

-- ----------------------------
-- Table structure for tourists_information
-- ----------------------------
DROP TABLE IF EXISTS `tourists_information`;
CREATE TABLE `tourists_information`  (
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `contact_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `nationality` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `passport_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`passport_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tourists_information
-- ----------------------------
INSERT INTO `tourists_information` VALUES ('Jack 10', '123456799', 'German', 'German', 'G00001078');
INSERT INTO `tourists_information` VALUES ('Jack 12', '123456801', 'Chinese', 'Chinese', 'G00001245');
INSERT INTO `tourists_information` VALUES ('Jack 13', '123456802', 'American', 'American', 'G00450013');
INSERT INTO `tourists_information` VALUES ('Jack 14', '123456803', 'British', 'British', 'G00045014');
INSERT INTO `tourists_information` VALUES ('Jack 15', '123456804', 'Japan', 'Japan', 'G00650015');
INSERT INTO `tourists_information` VALUES ('Jack 16', '123456805', 'German', 'German', 'G00450016');
INSERT INTO `tourists_information` VALUES ('Jack 17', '123456806', 'Russia', 'Russia', 'G00002117');
INSERT INTO `tourists_information` VALUES ('Jack 18', '123456807', 'Chinese', 'Chinese', 'G00450018');
INSERT INTO `tourists_information` VALUES ('Jack 19', '123456808', 'American', 'American', 'G65000019'); 
INSERT INTO `tourists_information` VALUES ('Jack 2', '123456791', 'British', 'British', 'G00788002');
INSERT INTO `tourists_information` VALUES ('Jack 3', '123456792', 'Japan', 'Japan', 'G06880003');
INSERT INTO `tourists_information` VALUES ('Jack 4', '123456793', 'German', 'German', 'G00788004');
INSERT INTO `tourists_information` VALUES ('Jack 5', '123456794', 'Russia', 'Russia', 'G00877005');
INSERT INTO `tourists_information` VALUES ('Jack 6', '123456795', 'Chinese', 'Chinese', 'G00867006');
INSERT INTO `tourists_information` VALUES ('Jack 7', '123456796', 'American', 'American', 'G00125007');
INSERT INTO `tourists_information` VALUES ('Jack 8', '123456797', 'British', 'British', 'G00468008');
INSERT INTO `tourists_information` VALUES ('Jack 9', '123456798', 'Japan', 'Japan', 'G07510009');
INSERT INTO `tourists_information` VALUES ('23', '18347413640', '23', 'Chinese', 'G15648798');
INSERT INTO `tourists_information` VALUES ('xzt', '13947436517', 'Name', 'Chinese', 'G45678917');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'Admin', '7758');

SET FOREIGN_KEY_CHECKS = 1;
