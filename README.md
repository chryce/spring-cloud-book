# spring-cloud-book

# spring cloud微服务架构实战派源码

入 门 篇

第1章 进入Spring Boot世界 2
1.1 认识Spring Boot 2
1.1.1 什么是Spring Boot 2
1.1.2 Spring、Spring Boot、Spring Cloud的关系 4
1.1.3 Spring Boot的特色 5
1.1.4 Spring Boot支持的开发语言 6
1.1.5 学习Spring Boot的前景展望 6
1.2 学习Spring Boot的建议 7
1.2.1 看透本书理论，模仿实战例子 7
1.2.2 利用开发工具自动学习 7
1.2.3 发现新功能的方法 8
1.2.4 建立高阶的思维方式 9
1.2.5 控制版本，降低犯错的代价 10
1.2.6 获取最新、最全的资料 11
1.2.7 学会自己发现和解决问题 11
1.2.8 善于提问，成功一半 12
第2章 准备开发环境 14
2.1 搭建环境 14
2.1.1 安装Java开发环境JDK 14
2.1.2 配置JDK的环境变量 15
2.2 熟悉Maven 18
2.2.1 安装及配置Maven 18
2.2.2 认识其中的pom.xml文件 19
2.2.3 Maven的运作方式 23
2.2.4 配置国内仓库 23
第3章 使用开发工具 25
3.1 安装开发工具IDEA及插件 25
3.1.1 安装IDEA 25
3.1.2 配置IDEA的Maven环境 27
3.1.3 安装Spring Assistant插件 27
3.1.4 安装插件Lombok 28
3.2 实例1：用Spring Boot输出“Hello World” 30
3.2.1 构建Spring Boot项目 30
3.2.2 编写控制器，实现输出功能 31
3.2.3 在IDEA中运行程序 33
3.2.4 打包成可执行的JAR包 33
3.3 在Eclipse中开发Spring Boot应用程序 35
3.3.1 安装Eclipse 35
3.3.2 安装Spring Tools 4插件 35
3.3.3 配置Eclipse的Maven环境 36
3.3.4 创建Spring Boot项目 37
3.4 了解Spring官方开发工具STS 37
3.5 必会的IDEA实用技能 38
3.5.1 智能提示代码 38
3.5.2 自动提示参数 39
3.5.3 实现自动转义 39
3.5.4 自定义高复用代码块 40
3.5.5 设置注释信息 41
3.5.6 超能的“Alt+Enter”快捷键 42
3.5.7 使用全局配置 42
3.5.8 自动生成语句 43
3.6 比较IDEA与Eclipse 44
3.7 如何使用本书源代码 47
3.7.1 在IDEA中使用 47
3.7.2 在Eclipse（STS）中使用 47

基 础 篇

第4章 Spring Boot基础 50
4.1 了解Spring Boot 50
4.1.1 了解Spring Boot项目结构 50
4.1.2 了解Spring Boot的入口类 51
4.1.3 了解Spring Boot的自动配置 52
4.1.4 了解Spring Boot热部署 52
4.1.5 实例2：定制启动画面 53
4.2 Spring Boot的常用注解 54
4.2.1 什么是注解式编程 55
4.2.2 了解系统注解 55
4.2.3 Spring Boot的常用注解 56
4.3 使用配置文件 61
4.3.1 实例3：演示如何使用application.yml文件 62
4.3.2 实例4：演示如何使用application.properties文件 65
4.3.3 实例5：用application.yml和application.properties配置多环境 67
4.4 了解Spring Boot的Starter 69
4.4.1 官方的Starter 69
4.4.2 使用Starter 70
第5章 分层开发Web应用程序 71
5.1 应用程序分层开发模式——MVC 71
5.1.1 了解MVC模式 71
5.1.2 MVC和三层架构的关系 72
5.2 使用视图技术Thymeleaf 73
5.2.1 认识Thymeleaf 73
5.2.2 基础语法 75
5.2.3 处理循环遍历 78
5.2.4 处理公共代码块 80
5.2.5 处理分页 81
5.2.6 验证和提示错误消息 82
5.2.7 实例6：编写Thymeleaf视图以展示数据 83
5.3 使用控制器 85
5.3.1 常用注解 85
5.3.2 将URL映射到方法 86
5.3.3 处理HTTP请求方法 87
5.3.4 处理内容类型 89
5.3.5 方法中参数的使用 90
5.4 理解模型 93
5.5 实例7：实现MVC模式的Web应用程序 94
5.5.1 添加依赖 94
5.5.2 创建实体模型 95
5.5.3 创建控制器 95
5.5.4 创建用于展示的视图 96
5.6 验证数据 96
5.6.1 认识内置的验证器Hibernate-validator 96
5.6.2 自定义验证功能 98
5.6.3 实例8：验证表单数据并实现数据的自定义验证 99
第6章 响应式编程 103
6.1 认识响应式编程 103
6.1.1 什么是WebFlux 103
6.1.2 比较MVC和WebFlux 103
6.1.3 认识Mono和Flux 105
6.1.4 开发WebFlux的流程 106
6.2 实例9：用注解式开发实现Hello World 107
6.2.1 配置WebFlux依赖 107
6.2.2 编写控制器 107
6.3 实例10：用注解式开发实现数据的增加、删除、修改和查询 108
6.3.1 创建实体类 108
6.3.2 编写控制器 108
6.3.3 测试API功能 110
6.4 实例11：用响应式开发WebFlux 111
6.4.1 编写处理器类Handler 111
6.4.2 编写路由器类Router 112
6.5 实例12：用WebFlux模式操作MongoDB数据库，实现数据的增加、删除、修改和查询功能112
6.5.1 添加依赖 112
6.5.2 创建实体类 113
6.5.3 编写接口 113
6.5.4 编写增加、删除、修改和查询
数据的API 113

进 阶 篇

第7章 Spring Boot进阶 118
7.1 面向切面编程AOP 118
7.1.1 认识Spring AOP 118
7.1.2 实例13：用AOP方式管理日志 119
7.2 认识IoC容器和Servlet容器 121
7.2.1 认识容器 121
7.2.2 实例14：用IoC管理Bean 123
7.2.3 实例15：用Servlet处理请求 125
7.3 过滤器与监听器 126
7.3.1 认识过滤器 126
7.3.2 实例16：实现过滤器 128
7.3.3 认识监听器 128
7.3.4 实例17：实现监听器 129
7.4 自动配置 130
7.4.1 自定义入口类 130
7.4.2 自动配置的原理 131
7.4.3 实例18：自定义Starter 133
7.5 元注解 136
7.5.1 了解元注解 136
7.5.2 实例19：自定义注解 137
7.6 异常处理 138
7.6.1 认识异常处理 138
7.6.2 使用控制器通知 141
7.6.3 实例20：自定义错误处理控制器 142
7.6.4 实例21：自定义业务异常类 143
7.7 单元测试 145
7.7.1 了解单元测试 145
7.7.2 Spring Boot 的测试库 145
7.7.3 快速创建测试单元 149
7.7.4 实例22：Controller层的单元测试 150
7.7.5 实例23：Service层的单元测试 153
7.7.6 实例24：Repository层的单元测试 154
第8章 用ORM操作SQL数据库 156
8.1 认识Java的数据库连接模板JDBCTemplate 156
8.1.1 认识JDBCTemplate 156
8.1.2 实例25：用JDBCTemplate
实现数据的增加、删除、修改和查询 157
8.1.3 认识ORM 161
8.2 JPA——Java持久层API 161
8.2.1 认识Spring Data 161
8.2.2 认识JPA 162
8.2.3 使用JPA 164
8.2.4 JPA注解和属性介绍 165
8.2.5 实例26：用JPA构建实体数据表 167
8.3 认识JPA的接口 169
8.3.1 JPA接口JpaRepository 169
8.3.2 分页排序接口PagingAndSortingRepository 169
8.3.3 数据操作接口CrudRepository 170
8.3.4 分页接口Pageable和Page 170
8.3.5 排序类Sort 171
8.4 JPA的查询方式 171
8.4.1 约定方法名 171
8.4.2 JPQL 173
8.4.3 原生SQL 174
8.4.4 Specifications 175
8.4.5 ExampleMatcher 177
8.4.6 谓语QueryDSL 177
8.4.7 NamedQuery 177
8.5 实例27：用JPA开发文章管理模块 178
8.5.1 实现文章实体 178
8.5.2 实现数据持久层 179
8.5.3 实现服务接口和服务接口的实现类 179
8.5.4 实现增加、删除、修改和查询的控制层API功能 180
8.5.5 实现增加、删除、修改和查询功能的视图层 182
8.6 实现自动填充字段 185
8.7 掌握关系映射开发 187
8.7.1 认识实体间关系映射 187
8.7.2 实例28：实现“一对一”映射 188
8.7.3 实例29：实现“一对多”映射 192
8.7.4 实例30：实现“多对多”映射 195
8.8 认识MyBatis——Java数据持久层框架 197
8.8.1 CRUD注解 198
8.8.2 映射注解 198
8.8.3 高级注解 199
8.9 实例31：用MyBatis实现数据的增加、删除、修改、查询和分页 200
8.9.1 创建Spring Boot项目并引入依赖 201
8.9.2 实现数据表的自动初始化 201
8.9.3 实现实体对象建模 202
8.9.4 实现实体和数据表的映射关系 202
8.9.5 实现增加、删除、修改和查询功能 203
8.9.6 配置分页功能 204
8.9.7 实现分页控制器 205
8.9.8 创建分页视图 206
8.10 比较JPA与MyBatis 207
第9章 接口架构风格——RESTful 209
9.1 REST——前后台间的通信方式 209
9.1.1 认识REST 209
9.1.2 认识HTTP方法与CRUD动作映射 210
9.1.3 实现RESTful风格的数据增加、删除、修改和查询 210
9.2 设计统一的RESTful风格的数据接口 212
9.2.1 版本控制 212
9.2.2 过滤信息 213
9.2.3 确定HTTP方法 213
9.2.4 确定HTTP的返回状态 213
9.2.5 定义统一返回格式 214
9.3 实例32：为APP、PC、H5网页提供统一风格的API 214
9.3.1 实现响应的枚举类 214
9.3.2 实现返回的对象实体 215
9.3.3 封装返回结果 215
9.3.4 统一处理异常 215
9.3.5 编写测试控制器 219
9.3.6 实现数据的增加、删除、修改和查询控制器 220
9.3.7 测试数据 221
9.4 实例33：用Swagger实现接口文档 222
9.4.1 配置Swagger 222
9.4.2 编写接口文档 224
9.5 用RestTemplate发起请求 224
9.5.1 认识RestTemplate 224
9.5.2 实例34：用RestTemplate发送GET请求 225
9.5.3 实例35：用RestTemplate发送POST请求 228
9.5.4 用RestTemplate发送PUT和DELETE请求 231
第10章 集成安全框架，实现安全认证和授权 233
10.1 Spring Security——Spring的安全框架 233
10.1.1 认识Spring Security 233
10.1.2 核心类 235
10.2 配置Spring Security 240
10.2.1 继承WebSecurityConfigurer-Adapter 240
10.2.2 配置自定义策略 240
10.2.3 配置加密方式 242
10.2.4 自定义加密规则 242
10.2.5 配置多用户系统 242
10.2.6 获取当前登录用户信息的几种方式 244
10.3 实例36：用Spring Security实现后台登录及权限认证功能 246
10.3.1 引入依赖 246
10.3.2 创建权限开放的页面 246
10.3.3 创建需要权限验证的页面 247
10.3.4 配置Spring Security 247
10.3.5 创建登录页面 248
10.3.6 测试权限 249
10.4 权限控制方式 249
10.4.1 Spring EL权限表达式 249
10.4.2 通过表达式控制URL权限 250
10.4.3 通过表达式控制方法权限 252
10.4.4 实例37：使用JSR-250注解 254
10.4.5 实例38：实现RBAC权限模型 256
10.5 认识JWT 258
10.6 实例39：用JWT技术为Spring Boot
的API增加认证和授权保护 260
10.6.1 配置安全类 260
10.6.2 处理注册 261
10.6.3 处理登录 262
10.6.4 测试多方式注册和登录 264
10.6.5 测试token方式登录和授权 265
10.7 Shiro——Apache通用安全框架 266
10.7.1 认识Shiro安全框架 266
10.7.2 认识Shiro的核心组件 267
10.8 实例40：用Shiro实现管理后台的动态权限功能 267
10.8.1 创建实体 267
10.8.2 实现视图模板 270
10.8.3 进行权限配置 271
10.8.4 实现认证身份功能 271
10.8.5 测试权限 272
10.9 对比Spring Security与Shiro 273
第11章 在Spring Boot中使用Redis实现高并发 275
11.1 认识Spring Cache 275
11.1.1 声明式缓存注解 276
11.1.2 实例41：用Cache进行缓存管理 278
11.1.3 整合Ehcache 281
11.1.4 整合Caffeine 281
11.2 认识Redis 282
11.2.1 对比Redis与Memcached 282
11.2.2 Redis的适用场景 285
11.3 Redis的数据类型 285
11.4 用RedisTemplate操作Redis的5种数据类型 287
11.4.1 认识opsFor方法 287
11.4.2 实例42：操作字符串 287
11.4.3 实例43：操作散列 290
11.4.4 实例44：操作列表 294
11.4.5 实例45：操作集合 298
11.4.6 实例46：操作有序集合Zset 301
11.4.7 比较RedisTemplate和StringRedisTemplate 306
11.5 实例47：用Redis和MyBatis完成缓存数据的增加、删除、修改、查询功能 306
11.5.1 在Spring Boot中集成Redis 306
11.5.2 配置Redis类 307
11.5.3 创建测试实体类 308
11.5.4 实现实体和数据表的映射关系 309
11.5.5 创建Redis缓存服务层 309
11.5.6 完成增加、删除、修改和查询测试API 310
11.6 实例48：用Redis和JPA实现缓存文章和点击量 311
11.6.1 实现缓存文章 311
11.6.2 实现统计点击量 312
11.6.3 实现定时同步 312
11.7 实例49：实现分布式Session 313
11.7.1 用Redis实现Session共享 313
11.7.2 配置Nginx实现负载均衡 314
第12章 用RabbitMQ实现系统间的数据交换 316
12.1 认识RabbitMQ 316
12.1.1 介绍RabbitMQ 316
12.1.2 使用场景 317
12.1.3 特性 318
12.2 RabbitMQ的基本概念 318
12.2.1 生产者、消费者和代理 318
12.2.2 消息队列 319
12.2.3 交换机（Exchange） 319
12.2.4 绑定 320
12.2.5 通道 321
12.2.6 消息确认 321
12.3 RabbitMQ的六种工作模式 321
12.3.1 简单模式 321
12.3.2 工作队列模式 321
12.3.3 交换机模式 322
12.3.4 Routing转发模式 322
12.3.5 主题转发模式 322
12.3.6 RPC模式 323
12.4 认识AmqpTemplate接口 323
12.4.1 发送消息 324
12.4.2 接收消息 324
12.4.3 异步接收消息 325
12.5 在Spring Boot中集成RabbitMQ 325
12.5.1 安装RabbitMQ 325
12.5.2 界面化管理RabbitMQ 326
12.5.3 在Spring Boot中配置RabbitMQ 327
12.6 在Spring Boot中实现RabbitMQ
的4种发送/接收模式 328
12.6.1 实例50：实现发送和接收队列 328
12.6.2 实例51：实现发送和接收对象 330
12.6.3 实例52：实现用接收器接收多个主题 331
12.6.4 实例53：实现广播模式 334
12.7 实例54：实现消息队列延迟功能 336
第13章 使用NoSQL数据库实现搜索引擎 339
13.1 Elasticsearch——搜索应用服务器 339
13.1.1 什么是搜索引擎 339
13.1.2 用数据库实现搜索功能 339
13.1.3 认识Elasticsearch 343
13.1.4 Elasticsearch应用案例 343
13.1.5 对比Elasticsearch与MySQL 343
13.1.6 认识ElasticSearchRepository 344
13.1.7 认识ElasticsearchTemplate 345
13.1.8 认识注解@Document 345
13.1.9 管理索引 347
13.2 实例55：用ELK管理Spring Boot应用程序的日志 348
13.2.1 安装Elasticsearch 348
13.2.2 安装Logstash 349
13.2.3 安装Kibana 350
13.2.4 配置Spring Boot项目 350
13.2.5 创建日志计划任务 351
13.2.6 用Kibana查看管理日志 352
13.3 实例56：在Spring Boot中实现增加、
删除、修改、查询 文档的功能 353
13.3.1 集成Elasticsearch 353
13.3.2 创建实体 353
13.3.3 创建增加、删除、修改和查询API 355
13.4 Elasticsearch查询 356
13.4.1 自定义方法 356
13.4.2 精准查询 357
13.4.3 模糊查询 359
13.4.4 范围查询 362
13.4.5 组合查询 362
13.4.6 分页查询 363
13.4.7 聚合查询 364
13.5 实例57：实现产品搜索引擎 365
13.6 Solr——搜索应用服务器 367
13.6.1 了解Solr 367
13.6.2 安装配置Solr 367
13.6.3 整合Spring Boot和Solr 368
13.7 实例58：在Solr中实现数据的增加、删除、修改和查询 369

13.7.1 创建User类 369
13.7.2 测试增加、删除、修改和查询功能 369
13.8 对比Elasticsearch和Solr 372

项目实战篇

第14章 实例59：开发企业级通用的后台系统 376
14.1 用JPA实现实体间映射关系 376
14.1.1 创建用户实体 376
14.1.2 创建角色实体 377
14.1.3 创建权限实体 378
14.2 用Spring Security实现动态授权（RBAC）功能 380
14.2.1 实现管理（增加、删除、修改和
查询）管理员角色功能 380
14.2.2 实现管理权限功能 381
14.2.3 实现管理管理员功能 383
14.2.4 配置安全类 384
14.2.5 实现基于RBAC权限控制
功能 386
14.3 监控Spring Boot应用 387
14.3.1 在Spring Boot中集成Actuator 387
14.3.2 在Spring Boot中集成Spring Boot admin应用监控 390
14.3.3 在Spring Boot中集成Druid连接池监控 392
第15章 实例60：实现一个类似“京东”的电子商务商城 394
15.1 用Spring Security实现会员系统 394
15.1.1 实现会员实体 394
15.1.2 实现会员接口 395
15.1.3 实现用户名、邮箱、手机号多方式注册功能 396
15.1.4 实现用MQ发送会员注册验证邮件 398
15.1.5 实现用户名、邮箱、手机号多方式登录功能 399
15.2 整合会员系统（Web、APP多端多方式注册登录）+后台系统 400
15.3 实现购物系统 401
15.3.1 设计数据表 401
15.3.2 实现商品展示功能 402
15.3.3 实现购物车功能 403
15.3.4 用Redis实现购物车数据持久化 404
15.4 用Redis实现分布式秒杀系统 406
15.4.1 实现抢购功能，解决并发超卖问题 406
15.4.2 缓存页面和限流 409
15.5 用RabbitMQ实现订单过期取消功能 409
15.6 实现结算和支付功能 411
15.6.1 实现结算生成订单功能 411
15.6.2 集成支付 412
