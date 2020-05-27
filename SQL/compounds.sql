/*
Navicat MySQL Data Transfer

Source Server         : Mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : j2ee

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-05-27 22:30:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for compounds
-- ----------------------------
DROP TABLE IF EXISTS `compounds`;
CREATE TABLE `compounds` (
  `english_name` varchar(255) DEFAULT NULL,
  `chinese_name` varchar(255) DEFAULT NULL,
  `types` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of compounds
-- ----------------------------
INSERT INTO `compounds` VALUES ('DL-2-Aminoadipic acid', 'DL-2-氨基己二酸', '氨基酸');
INSERT INTO `compounds` VALUES ('γ-Aminobutanoic acid (Gaba)', 'γ-氨基丁酸', '氨基酸');
INSERT INTO `compounds` VALUES ('Hydroxyproline', '羟基脯氨酸?', '氨基酸');
INSERT INTO `compounds` VALUES ('γ-Glu-Cys；γ-L-Glutamyl-L-cysteine', 'G-谷氨酸-半胱-三氟乙酸盐', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Pyroglutamic acid', 'L-焦谷氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Alanine; Ala', 'L-丙氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Alanyl-L-glutamine', 'L-丙氨酰-L-谷氨酰胺', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Arginine', 'L-精氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Asparagine', 'L-天冬酰胺', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Aspartic Acid; Asp', 'L-天门冬氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('DL-Citrulline', 'DL-瓜氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('Cystathionine', 'DL-胱硫醚', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Cysteine', 'L-半胱氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Cystine; Cys', 'L-胱氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Glutamic Acid; Glu', 'L-谷氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Glutamine; Gln', 'L-谷氨酰胺', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Glutathione reduced', 'L-还原型谷胱甘肽', '氨基酸');
INSERT INTO `compounds` VALUES ('Glycine; Gly', '甘氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('Glycyl-L-glutaMine Monohydrate', '甘氨酰-L-谷氨酰胺一水合物', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Histidine', 'L-组氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Isoleucine', 'L-异亮氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Kynurenine', 'L-犬尿氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Leucine, Leu', 'L-亮氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Lysine', 'L-赖氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Methionine; Met', 'L-蛋氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('DL-Methionine sulfoxide', 'DL-蛋氨酸亚砜', '氨基酸');
INSERT INTO `compounds` VALUES ('N-Acetylaspartic acid', 'N-乙酰-L-天门冬氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('N-Acetylcysteine', 'N-乙酰-L-半胱氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Ornithine', 'L-鸟氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('英文名称', '中文名称', '分类');
INSERT INTO `compounds` VALUES ('L-Glutathione oxidized', 'L-谷胱甘肽 (氧化型)', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Phenylalanine; Phe', 'L-苯丙氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('D-Pipecolic acid', 'D-哌啶酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Proline; Pro', 'L-脯氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Serine; Ser', 'L-丝氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Threonine, Thr', 'L-苏氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Tryptophan, Trp', 'L-色氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Tyrosine, Tyr', 'L-络氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('L-Valine; Val', 'L-缬氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('Boc-D-Tyr-OH', 'Boc-D-酪氨酸', '氨基酸');
INSERT INTO `compounds` VALUES ('Vitamin B1', '硫胺素盐酸盐(维生素B1)', '维生素');
INSERT INTO `compounds` VALUES ('4-Aminobenzoic acid', ' 对-氨基苯甲酸', '维生素');
INSERT INTO `compounds` VALUES ('Vitamin C', '抗坏血酸(维生素C)', '维生素');
INSERT INTO `compounds` VALUES ('D(+)-Biotin', '生物素(维生素B7)', '维生素');
INSERT INTO `compounds` VALUES ('Choline', '胆碱', '维生素');
INSERT INTO `compounds` VALUES ('Vitamin B12', '钴胺素(维生素B12)', '维生素');
INSERT INTO `compounds` VALUES ('Vitamin D2', '维生素D2', '维生素');
INSERT INTO `compounds` VALUES ('Folic acid', '叶酸(维生素B9)', '维生素');
INSERT INTO `compounds` VALUES ('5-formyltetrahydrofolate ', '5-甲酰四氢叶酸', '维生素');
INSERT INTO `compounds` VALUES ('Lipoic acid', '硫辛酸', '维生素');
INSERT INTO `compounds` VALUES ('Niacinamide', '烟酰胺(维生素B3)', '维生素');
INSERT INTO `compounds` VALUES ('Nicotinic acid', '烟酸(维生素B3)', '维生素');
INSERT INTO `compounds` VALUES ('Pantothenic Acid', 'D-泛酸(维生素B5)', '维生素');
INSERT INTO `compounds` VALUES ('Pyridoxamine dihydrochloride', '吡哆胺盐酸盐(维生素B6)', '维生素');
INSERT INTO `compounds` VALUES ('Pyridoxal hydrochloride', '吡哆醛盐酸盐(维生素B6)', '维生素');
INSERT INTO `compounds` VALUES ('Pyridoxine', '吡哆醇(维生素B6)', '维生素');
INSERT INTO `compounds` VALUES ('Vitamin B2', '核黄素(维生素B2)', '维生素');
INSERT INTO `compounds` VALUES ('Vitamin E', '维生素E', '维生素');
INSERT INTO `compounds` VALUES ('Vitamin E acetate', '维生素E乙酸酯', '维生素');
INSERT INTO `compounds` VALUES ('Adenine         ', '腺嘌呤(维生素B4 ）', '核苷酸');
INSERT INTO `compounds` VALUES ('Adenosine', '腺苷', '核苷酸');
INSERT INTO `compounds` VALUES ('Adenosine 5\'-monophosphate', '腺苷酸', '核苷酸');
INSERT INTO `compounds` VALUES ('Cytidine', '胞苷', '核苷酸');
INSERT INTO `compounds` VALUES ('Cytidylic acid', '胞苷酸', '核苷酸');
INSERT INTO `compounds` VALUES ('2\'-Deoxycytidine', '2\'-脱氧胞苷', '核苷酸');
INSERT INTO `compounds` VALUES ('Guanine', '鸟嘌呤', '核苷酸');
INSERT INTO `compounds` VALUES ('英文名称', '中文名称', '分类');
INSERT INTO `compounds` VALUES ('Guanosine', '鸟苷', '核苷酸');
INSERT INTO `compounds` VALUES ('Guanosine-5\'-monophosphate', '鸟苷酸', '核苷酸');
INSERT INTO `compounds` VALUES ('Hypoxanthine', '次黄嘌呤', '核苷酸');
INSERT INTO `compounds` VALUES ('Inosine', '次黄苷', '核苷酸');
INSERT INTO `compounds` VALUES ('Thymidine', '胸苷', '核苷酸');
INSERT INTO `compounds` VALUES ('2,?4(1H,?3H)?-?Pyrimidinedione, 5-?methyl-', '胸腺嘧啶', '核苷酸');
INSERT INTO `compounds` VALUES ('2,?4(1H,?3H)?-?Pyrimidinedione', '尿嘧啶', '核苷酸');
INSERT INTO `compounds` VALUES ('Uric acid', '尿酸', '核苷酸');
INSERT INTO `compounds` VALUES ('Uridine', '尿苷', '核苷酸');
INSERT INTO `compounds` VALUES ('Xanthine', '2,6-二羟基嘌呤', '核苷酸');
INSERT INTO `compounds` VALUES ('Xanthosine', '黄嘌呤核苷', '核苷酸');
INSERT INTO `compounds` VALUES ('Penicillin G sodium', '青霉素G钠', '抗生素');
INSERT INTO `compounds` VALUES ('ethanolamine', '乙醇胺', '其他');
INSERT INTO `compounds` VALUES ('2-Ketoisovaleric acid', '3-甲基-2-氧丁酸', '其他');
INSERT INTO `compounds` VALUES ('3-Methyl-2-oxovaleric acid', '3-甲基-2-氧基戊酸', '其他');
INSERT INTO `compounds` VALUES ('3-(4-Hydroxyphenyl)lactate', '3-(4-羟基苯基)乳酸', '其他');
INSERT INTO `compounds` VALUES ('Citric acid', '柠檬酸', '其他');
INSERT INTO `compounds` VALUES ('Ethylenediamine', '乙二胺', '其他');
INSERT INTO `compounds` VALUES ('Fumaric acid', '延胡索酸（富马酸）', '其他');
INSERT INTO `compounds` VALUES ('Glyceric acid', '甘油酸', '其他');
INSERT INTO `compounds` VALUES ('Histamine', '组胺', '其他');
INSERT INTO `compounds` VALUES ('Isocitric acid', '异柠檬酸', '其他');
INSERT INTO `compounds` VALUES ('Lactic acid', '乳酸', '其他');
INSERT INTO `compounds` VALUES ('DL-Malic acid', 'DL-苹果酸', '其他');
INSERT INTO `compounds` VALUES ('O-Phosphorylethanolamine', 'O-磷酸乙醇胺', '其他');
INSERT INTO `compounds` VALUES ('Putrescine ', '腐胺', '其他');
INSERT INTO `compounds` VALUES ('Pyruvic acid', '丙酮酸', '其他');
INSERT INTO `compounds` VALUES ('Succinic acid ', '丁二酸', '其他');
INSERT INTO `compounds` VALUES ('DL-Mevalonic acid ', '甲羟戊酸', '其他');
INSERT INTO `compounds` VALUES ('itaconic acid', '衣康酸', '其他');
INSERT INTO `compounds` VALUES ('phthalic acid', '对苯二甲酸', '其他');
INSERT INTO `compounds` VALUES ('4-coumaric acid', '4-羟基肉桂酸', '其他');
INSERT INTO `compounds` VALUES ('tropic acid', '莨菪酸', '其他');
INSERT INTO `compounds` VALUES ('3,5-dinitrosalicylic acid ', '3,5-二硝基水杨酸', '其他');
INSERT INTO `compounds` VALUES ('Gluconic acid', '葡萄糖酸', '其他');
