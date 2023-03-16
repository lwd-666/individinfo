package com.arglio;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @autor soft
 * 2023/3/12
 */

public class CodeTest {
    @Test
    public void serviceImplTest(){
//        @Override
//        public Student getByStudentById(String sid) {
//            QueryWrapper<Student> studentQueryWrapper = new QueryWrapper<>();
//            studentQueryWrapper.eq("SId",sid);
//            Student student = baseMapper.selectOne(studentQueryWrapper);
//            return student;
//        }
//
//        @Override
//        public List<Student> getList() {
//            return baseMapper.selectList(null);
//        }
    }
    @Test
    public void controllerTest(){
//        @Autowired
//        private StudentService studentService;
//
//        @GetMapping("getByStudentById/{studentId}")
//        public Student getByStudentById(@PathVariable String studentId){
//            Student student = studentService.getByStudentById(studentId);
//            return student;
//        }
//        @GetMapping("getList")
//        public List<Student> getList(){
//            List<Student> studentList = studentService.getList();
//            return studentList;
//        }
    }
    @Test
    public void genCode(){
        //创建自动生成器
        AutoGenerator autoGenerator = new AutoGenerator();

        //数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/school_practice?serverTimezone=Asia/Shanghai");
        dataSourceConfig.setPassword("123456");
        dataSourceConfig.setUsername("root");
        autoGenerator.setDataSource(dataSourceConfig);

        //生成目录
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setAuthor("Mr.Li");
        //D:\java project\WorkSpace2\individinfo\individinfo\service-controller\src\main\java\com\arglio
        globalConfig.setOutputDir("D:\\java project\\WorkSpace2\\individinfo\\individinfo\\service-core\\src\\main\\java");
        globalConfig.setSwagger2(true);
        globalConfig.setIdType(IdType.AUTO);
        globalConfig.setServiceName("%sService");
        autoGenerator.setGlobalConfig(globalConfig);

        //包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.arglio.individ.core");
        packageConfig.setEntity("pojo.Entity");
        autoGenerator.setPackageInfo(packageConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//数据库表字段映射到实体的命名策略
        strategy.setEntityLombokModel(true); // lombok
//        strategy.setLogicDeleteFieldName("is_deleted");//逻辑删除字段名
        strategy.setEntityBooleanColumnRemoveIsPrefix(true);//去掉布尔值的is_前缀（确保tinyint(1)）
        strategy.setRestControllerStyle(true); //restful api风格控制器
        autoGenerator.setStrategy(strategy);

        //执行自动生成器
        autoGenerator.execute();

    }
}
