
# 概要

整套架构的项目名称以DOTA2中的英雄名称命名

## karl

架构-服务配置

## 1.0.0

- 引入apollo
- 添加environment.properties 、customized.properties

通常我们的项目配置文件由如下三部分构成：
- application.properties: 项目基础配置，不需要同步至apollo
- environment.properties: 环境配置，比如数据库、redis、consul等中间件配置, 对应apollo的namespace
- customized.properties: 自定义配置，比如自己些的@Value属性信息, 对应apollo的namespace
    

