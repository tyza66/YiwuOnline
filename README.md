# YiwuOnline
### 义乌在线
<details><summary>登录界面</summary>
<img src="./效果/登录页面.png"/>
</details>

<details><summary>库存管理界面</summary>
<img src="./效果/库存管理.png"/>
</details>



##### 简述

- 一个简单的SpringBoot后台管理项目
- 有账号登录、注册、登陆状态验证等功能
- 实现库存、出货、物流信息管理
- 就是增、删、改、查
- 支持表格打印、多条信息管理，复制
- 支持快捷按物流信息查询
- 使用session保存登陆状态

##### 使用技术

- 前端：jQuery，Bootstrap，Layui
- 后端：Spring，SpringBoot，MyBatis，MyBatis Plus，knife4j，Thymeleaf，Hutool
- 数据库：MySQL问题

##### 问题

- 在数据库设计的时候有一些疏漏，货物的钱的单位应该单独的出来，以方便库存数量的修改，而不是本项目中的使用字符串来一起存储库存量和单位，按照现在的形式出库商品时很难实现更新库存数量，于是在本项目中出库商品的时候商品库存数量不会自动进行更改，而需要进行手动的修改。

##### 本地复现

1. 建表
2. 使用maven导入依赖
3. 使用ide运行项目

By：tyza66(洮羱芝闇)
