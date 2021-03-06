package ua.com.feiron.bookmanager.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.com.feiron.bookmanager.domain.Book;

import java.util.List;

@Repository
@Transactional
public class BookRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void addBook(Book book) {
        this.sessionFactory.getCurrentSession().save(book);
    }

    public List<Book> listAll() {
        return this.sessionFactory.getCurrentSession().createQuery("from Book").list();
    }

    public void removeBook(Integer iD) {
        Book contact = (Book) this.sessionFactory.getCurrentSession().load(Book.class, iD);
        if (null != contact) {
            this.sessionFactory.getCurrentSession().delete(contact);
        }
    }

}