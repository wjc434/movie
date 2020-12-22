package com.scomm.movie.service;
/*
 * package com.rhb.movie.service;
 * 
 * import java.util.List;
 * 
 * import org.hibernate.Session;
 * 
 * import com.rhb.movie.model.Movie; import
 * com.rhb.movie.repository.HibernateUtil;
 * 
 * public class MovieService {
 * 
 * public int saveMovie(String title, String intro, String category, Float
 * rating) { Movie m = new Movie(); m.setTitle(title); m.setIntro(intro);
 * m.setCategory(category); m.setRating(rating);
 * 
 * Session session = HibernateUtil.getSessionFactory().openSession();
 * session.beginTransaction();
 * 
 * int id = (Integer) session.save(m); session.getTransaction().commit();
 * session.close(); return id; }
 * 
 * public List<Movie> getAllMovies() { Session session =
 * HibernateUtil.getSessionFactory().openSession(); session.beginTransaction();
 * 
 * @SuppressWarnings("unchecked") List<Movie> movies = (List<Movie>)
 * session.createQuery( "FROM tblMovie ORDER BY movie_id ASC").list();
 * 
 * session.getTransaction().commit(); session.close(); return movies; }
 * 
 * public void updateMovie(int id, Float rating) { Session session =
 * HibernateUtil.getSessionFactory().openSession(); session.beginTransaction();
 * 
 * Movie m = (Movie) session.get(Movie.class, id); m.setRating(rating);
 * 
 * session.getTransaction().commit(); session.close(); }
 * 
 * public void deleteMovie(int id) { Session session =
 * HibernateUtil.getSessionFactory().openSession(); session.beginTransaction();
 * 
 * Movie m = (Movie) session.get(Movie.class, id); session.delete(m);
 * session.getTransaction().commit(); session.close(); } }
 */