package interview;

/**
 * @ClassName: JavaQuestion
 * @Description:
 * @Author: Per
 * @Date: 2023/8/9 14:12
 */
public class JavaQuestion {

    /**
     * 尚硅谷课程
     * redis相关问题    ----    redsi 6之后的版本
     */
    //redis的5大基本数据类型、4种新类型


    //NoSql数据库
    //解决功能性问题、解决扩展性问题（框架--可扩展性）、解决性能性问题（用户量增加---NoSQL）

    //Web发展过程：      a.单体应用（早期-单体Web服务器：CPU、内存、IO压力）       --解决：多台服务器，集群、分布式架构，负载均衡（Nginx）；
    //                                                                      访问数据库（session如何存储，登陆之后用户信息放在session中）   session共享问题：登录访问的是服务器1，第二次访问可能去服务器2，如何证明是否登录
    //                                                                      解决方法：1.存在cookie中（不安全）       2.session赋值，存储时候，复制到其他服务器（内容相同，浪费空间--服务器越多浪费空间越多）
    //                                                                              3.放在NoSQL数据库中       --好处：存储用户信息，放在内存中，不需要IO
    //                          NoSQL好处2：解决IO压力（缓存数据库）             --正常：数据库拆分：分库分表，破坏数据结构





    //NoSQL的定义：not only SQL(不仅仅是SQL)，非关系型数据库
    //特点：不遵循SQL的标准，不支持ACID（事务的四个特效，原子、一致、持久、隔离）、远超SQL的性能
    //使用场景：（用不着SQL、用了SQL也解决不了）高并发读写、海量数据读写（高可扩展性）      -----秒杀场景
    //不适用场景：事务的支持、结构化存储（复杂的关系）
    //常见的NoSQL数据库：MemCache（不能持久化）、Redis（支持持久化、除了String支持各种数据类型）、MongoDB（文档型数据库，类JSON）、HBase





    //Redis安装：开源的key-value的存储系统
    //Redis支持各种方式的排序
    //存储时效性数据很方便：短信验证码；计数器、秒杀       --  大量数据的去重数据
    //官网下载，Linux系统中安装：上传压缩包，要有c语言的环境（Gcc环境即可）       tar -zxvf解压
    //Redis启动：前台启动 redis -server
    //          后台启动  进入opt目录，赋值并修改conf配置文件（配置文件中开启后台启动命令，设为yes）    redis -server /etc/redis.conf
    //          redis -cli,进入命令行操作






    //Redis的6379端口（端口号来源：MERZ）、单线程+多路IO复用技术
    //Redis中默认16个数据库：默认0号库，select 1进入1号库
    //单线程+多路IO复用技术：例子，黄牛买票（黄牛--单线程，多个买票人：买到票来取，买不到去做自己的事情）






    //Redsi中常用的数据类型：
    //Redis中的当前库操作命令：
    //          设置key：set （key） （value）
    //          获取所有的key：keys *
    //          获取key的类型：type （key）
    //          查询key的时间：ttl （key）
    //          ····等
    //          查看当前库key的数量：dbsize






    //Redsi中常用的数据类型：String
    //常用，二进制安全的(视频图片都可以存储)，value最大512M
    //命令：     设置值：set（重复设置值，会覆盖）
    //          取值：get
    //          追加：append
    //          设置值：setnx（有值设置失败，无值设置成功）
    //redis原子操作：线程之间不会被打断（多线程则无法保证）。 incr是原子操作
    // Java中的i++不是原子操作（三步：取值、加1、赋值）     --可能结果：2~200






    //Redsi中常用的数据类型：String
    // mset、mget、msetnx
    //String底层数据接口：简单的动态字符串，类似于ArrayList



}
