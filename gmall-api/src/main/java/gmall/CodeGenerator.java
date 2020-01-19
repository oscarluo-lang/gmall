package gmall;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class CodeGenerator {
    public static void main(String[] args) {
        String moduleName = "sms";
        // 1.创建代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 2.全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir("C:\\Users\\123\\IdeaProjects\\gmall-parent\\gmall-mbg" + "/src/main/java");
        gc.setAuthor("oscar");
        gc.setOpen(false); //是否打开资源管理器
        gc.setFileOverride(false);
        gc.setServiceName("%sService");//去掉Service接口的首字母I
        gc.setIdType(IdType.AUTO); //主键策略
        gc.setDateType(DateType.ONLY_DATE);//定义生成的实体类中日期类型
        gc.setSwagger2(true);//开启Swagger2模式
        gc.setBaseColumnList(true);
        // gc.setSwagger2(true); 实体属性 Swagger2 注解
        mpg.setGlobalConfig(gc);

        // 3.数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://192.168.11.128:3306/gmall_"+ moduleName +"?useUnicode=true&useSSL=false&characterEncoding=utf8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 4.包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(moduleName);//模块名
        pc.setParent("com.sap.gmall");
        pc.setController("controller");
        pc.setEntity("entity");
        pc.setService("service");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);

        //5.策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
//        strategyConfig.setInclude(moduleName + "_\\w*");//设置要映射的表名
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略
        strategyConfig.setTablePrefix(pc.getModuleName() + "_");//设置表前缀不生成
        strategyConfig.setEntityTableFieldAnnotationEnable(true);//是否生成实体时，生成字段注解
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);//数据库表字段映射到实体的命名策略
        strategyConfig.setEntityLombokModel(true);//lombok模型@Accessors(chain = true) setter 链式操作

        strategyConfig.setRestControllerStyle(true);//restful api风格控制器
        strategyConfig.setControllerMappingHyphenStyle(true);//url中驼峰转连字符

        mpg.setStrategy(strategyConfig);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        //6.执行
        mpg.execute();
    }
}
