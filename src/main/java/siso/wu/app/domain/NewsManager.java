package siso.wu.app.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import siso.wu.app.domain.News;

public class NewsManager {

    public static void main(String[] args)
        throws Exception {
        //ʵ����Configuration��
        Configuration conf = new Configuration() 

        //���淽��Ĭ�ϼ���hibernate.cfg.xml�ļ�
            .configure();
        //��Configuration����SessionFactory
        SessionFactory sf = conf.buildSessionFactory();
        //����Session
        Session sess = sf.openSession();
        //��ʼ����
        Transaction tx = sess.beginTransaction();
        //������Ϣʵ��
        News n = new News();
        //������Ϣ�������Ϣ����
        n.setTitle("NET������Ա");
        n.setContent("ASP.NET WebӦ��,������Ӧ��ϵͳ����ǰ����Ϊ .NET ������Ա��Ҫ���ĵ�");
        //������Ϣ
        sess.save(n);
        //�ύ����
        tx.commit();
        //�ر�Session
        sess.close();
        sf.close();
    }
}
