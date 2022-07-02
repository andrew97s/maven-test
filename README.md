# maven-test
to test maven

1. 项目中使用spring boot maven plugin 打包会使当前项目所依赖的jar包全部打入当前jar包 ，
使得项目jar包 过于臃肿（时常大至100M+）
2. 现在需要将第三方jar包 与项目jar包分离 ， 项目jar包可以瘦身至k级别 ， 方便不同环境部署 ， 节省部署时间
3. 目前有两种实现方法
 3.1 将项目的子模块与当前模块一起打包成同一个jar包（class级别）， 不是很优雅 ， 且代码结构很混乱 2022-07-02已实现
 3.2 将项目的子模块达成jar包 放入当前模块内的lib目录 ， 第三方jar包放在当前jar包外的lib目录 ；较以上实现方式会更清晰一些 ， 待实现 !