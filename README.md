# imall
>  intelligence  mall
#### 技术选型

- 语言框架
	- JDK 1.8
	- Spring Boot 2.1.6.RELEASE
	- Spring Cloud Greenwich.SR1
	- Spring Cloud OAuth2
	- Spring Cloud Security
- 构建工具
	- Intellij IDEA Ultimate 2019.2
	- Maven
- 其他
	- Redis
	- Windows 10
#### 文件目录
```
├──imall
    ├─imall-auth
    │  └─src
    │      ├─main
    │      │  ├─java.com.imall.auth
    │      │  └─resources
    │      └─test
    │          └─java.com.imall.auth
    ├─imall-common
    │  └─src
    │      ├─main
    │      │  ├─java.com.imall.common
    │      │  └─resources
    │      └─test
    │          └─java.com.imall.common
    ├─imall-gateway
    │  └─src
    │      ├─main
    │      │  ├─java.com.imall.gateway
    │      │  └─resources
    │      └─test
    │          └─java.com.imall.gateway
    ├─imall-parent
    │  ├─doc
    │  └─sql
    ├─imall-practice
    │  ├─imall-pracite-helloworld
    │  │  └─src
    │  │      ├─main
    │  │      │  ├─java.com.imall.pracite
    │  │      │  └─resources
    │  │      └─test
    │  │          └─java.com.imall.pracite
    │  └─Note
    ├─imall-register
    │  └─src
    │      ├─main
    │      │  ├─java.com.imall.register
    │      │  └─resources
    │      └─test
    │          └─java.com.imall.register
    └─imall-server
        ├─imall-server-system
        │  └─src
        │      ├─main
        │      │  ├─java.com.imall.server.system
        │      │  └─resources
        │      └─test
        │          └─java.com.imall.server.system
        └─imall-server-test
            └─src
                ├─main
                │  ├─java.com.imall.server.test
                │  └─resources
                └─test
                    └─java.com.imall.server.test
```
- imall-parent
- imall-common
- imall-register
- imall-auth 
- imall-gateway
- imall-practice
    - [imall-pracite-helloworld](imall-practice/Note/000SpringBoot练习.md)
    - ....
- imall-server
    - imall-server-system
    - imall-server-test
    - ....
    
#### 框架使用文档

1. 前端
2. 后端

#### TODO
- [x] 框架搭建
    - [x] 基础框架搭建
    - [x] 架构完善
- [ ] 权限管理框架
    - [ ] 登陆流程完善
- [ ] 微服务部署
- [ ] 内容管理服务
- [ ] 商品管理服务
- [ ] 搜索服务
- [ ] 语音搜索服务
- [ ] 媒资管理服务

- [ ] 人工智能模块使用
    - [ ] 个性化推荐服务
    - [ ] 语音识别与搜索