# spring-cloud

eureka-provider-1 spring-cloud 服务1 运行端口在8764 提供 user-provider 服务

eureka-provider-2 spring-cloud 服务2 运行端口在8763 提供 user-provider 服务

eureka-server 服务注册中心 运行端口  8761、user-provider-1、user-provider-2 需要注册到服务注册中心

eureka-test 用于调试user-provider demo  通过 http://localhost:8769/test/account 可调用到 eureka-provider-1 eureka-provider-2 提供的 user-provider 服务


zuul-server api服务网关 运行端口 5555  通过http://localost:5555/user-provider/user/register 可调用到  eureka-provider-1 eureka-provider-2 提供的 用户注册操作


zuul-server api服务网关 访问地址 http://{ip}:{api服务网关运行端口}/{用户注册到eureka-server服务注册中心的 
Application名称}/具体的controller


 user-provider-1   user-provider-2 用于模拟多台负载操作





