package com.marlabs.daoimpl;

//@Repository
public class AdminDaoImpl {
	/*@Autowired
	private SessionFactory sf;

	@Override
	public Admin addAdmin(Admin admin) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(admin);
		tx.commit();
		session.close();
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(admin);
		tx.commit();
		session.close();
		return admin;
	}

	@Override
	public Admin getAdminById(Integer id) {
		Session session = sf.openSession();
		Admin admin = session.get(Admin.class, id);
		session.close();
		return admin;
	}

	@Override
	public Admin deleteAdminById(Integer id) {
		
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> getAllAdmins() {
		Session session = sf.openSession();
		String getAllAdmins = "From Admin";
		Query query = session.createQuery(getAllAdmins);
		return query.list();
	}
*/
}
