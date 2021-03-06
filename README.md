# 前言

本系列旨在搭建一套业务简洁，但技术链条完整的人力资源服务平台（HRSP）。

整个系统定位成SaaS平台，它是为人力资源供应商提供人事外包，派遣和代理形式的线上服务平台。可以为企业职工提供缴交社保公积金，交税，薪资计算发放和商保等服务。

HRSP采用微服务方式开发，接口开发使用REST API 风格。 开发技术栈是Spring Boot， Spring Cloud， Docker 和 Kubernetes。

# 技术方案初期架构图

# 基础组件

common：通用代码模块

# 微服务设计

简易版包含三个微服务模块，user用户中心，product产品中心和order订单中心。

user用户中心：入职企业的员工信息登记，用户权限管理

product产品中心：社保，公积金，商保

order订单中心：员工缴纳的社保，公积金，商保，交税，薪资

## user 用户中心

**使用框架：** 原生Mybatis

**数据库：** hrsp_user

**功能：**

员工入职信息登记

员工入职信息查询

RBAC

## product 产品中心

**使用框架：** 通用Mapper

**数据库：** hrsp_product

**功能：**

社保公积金查询

## order 订单中心

**使用框架：** Spring Data JPA

**数据库：** hrsp_order

**功能：**

生成职员订单

查询职员订单

## API 网关

