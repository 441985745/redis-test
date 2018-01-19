# redis-test,activiti-test
<p>springboot整合redis+mybatis+activiti简单测试demo</p>
<p>此项目用来给初学者练手的demo,可以在单元测试测试样例</p>
<p>1.只是一个简单的样例demo,基本架子搭建好,用单元测试来熟悉功能</p>
<p>2.数据库表对应User实体类建一个就行,很简单,一共3个字段,activiti应该会自行建表,我没试,等你们试试吧,不行的话就我就再在单元测试里写个建表sql</p>
<p>3.简单的增加了打印sql语句</p>
<p>4.单元测试前别忘了开启redis</p>
<p>5.集成了activiti,画流程图和部署流程图,需要用activiti-explorer.war(将次war包放入tomcat启动运行,网上有教程,自行百度即可),部署成功的流程图可以在单元测试中测试,activiti的几种service直接在项目中用注入即可<p>


<p>6.新增了视图层,用了freemarker模板</p>
<p>7.多个环境配置文件application-test</p>



最后的最后,有什么情况请一定和我交流,共同进步!!!期待您的fork