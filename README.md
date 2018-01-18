# redis-test,activiti-test
<span>springboot整合redis+mybatis+activiti简单测试demo</span></br>
<span>此项目用来给初学者练手的demo,可以在单元测试测试样例</span>
<span>只是一个简单的样例demo,service层和dao层还有实体类并没有分开文件夹</span></br>
<span>数据库表对应User实体类建一个就行,很简单,一共3个字段,activiti应该会自行建表,我没试,等你们试试吧,不行的话就我就再在单元测试里写个建表sql</span></br>
<span>简单的增加了打印sql语句</span></br>
<span>集成了activiti,画流程图和部署流程图,需要用activiti-explorer.war(将次war包放入tomcat启动运行,网上有教程,暂时不打算纳入此项目中),部署成功的流程图可以在单元测试中测试,activiti的几种service直接在项目中用注入即可<span>

