package applications;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;


public abstract class GenericDao
{

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession()
    {
        return getSessionFactory().getCurrentSession();
    }

    protected HibernateTemplate getHibernateTemplate()
    {
        return new HibernateTemplate(getSessionFactory());
    }

    private SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
    
    
    

}
