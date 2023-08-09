package interview;

/**
 * @ClassName: JavaQuestion
 * @Description:
 * @Author: Per
 * @Date: 2023/8/9 14:12
 */
public class JavaQuestion {

    /**
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
    //常见的NoSQL数据库：MemCache（不能持久化）、Redis（支持持久化、除了String支持各种数据类型）、MongoDB（文档型数据库，类JSON）
}
