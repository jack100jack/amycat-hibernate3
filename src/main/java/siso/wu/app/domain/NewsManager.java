package siso.wu.app.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import siso.wu.app.domain.News;

public class NewsManager {

    public static void main(String[] args)
        throws Exception {
        //实例化Configuration，
        Configuration conf = new Configuration() 

        //下面方法默认加载hibernate.cfg.xml文件
            .configure();
        //以Configuration创建SessionFactory
        SessionFactory sf = conf.buildSessionFactory();
        //创建Session
        Session sess = sf.openSession();
        //开始事务
        Transaction tx = sess.beginTransaction();
        //创建消息实例
        News n = new News();
        //设置消息标题和消息内容
        n.setTitle("NET开发人员");
        n.setContent("ASP.NET Web应用,以下是应用系统发布前，作为 .NET 开发人员需要检查的点");
        //保存消息
        sess.save(n);
        //提交事务
        tx.commit();
        //关闭Session
        sess.close();
        sf.close();
    }
}
