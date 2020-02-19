package ini.jzx.text;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ini.jzx.dao.CustomerDao;
import ini.jzx.entity.Customer;

@RunWith(SpringJUnit4ClassRunner.class)//声明使用spring提供的单元测试
@ContextConfiguration(locations = "classpath:applicationContext.xml")//指定加载spring配置信息

public class CustomerDaoTest {
	@Autowired
	private CustomerDao customerDao;
	
	@Test
	public void testFindAll() {
		List<Customer> customerList = customerDao.findAll();
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
		
	}
	@Test
	public void testFindByCustId() {
		Customer customer = customerDao.findByCustId(3l);
		if(customer==null) {
			System.out.println("查询结果为空");
		}else {
			System.out.println(customer);
		}
		
		
	}
	/**
	 * 延迟加载
	 */
	@Test
	@Transactional
	public void testGetOne() {
		Customer customer = customerDao.getOne(3L);
		
		System.out.println(customer);
		
	}
	/**
	 * Save():
	 * 	如果设置了id，就根据id进行跟新      c.setCustId(2);
	 * 	如果没有设置id，就插入该实体
	 */
	@Test
	public void testSave() {
		Customer c=new Customer();
		c.setCustName("cxy");
		c.setCustLevel("小白");
		customerDao.save(c);
	}
	@Test
	public void testDel() {
		System.out.println("asd;lkfja;sldkfja;sldkfj");
	}
}
