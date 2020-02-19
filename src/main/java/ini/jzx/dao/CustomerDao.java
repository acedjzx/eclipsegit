package ini.jzx.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ini.jzx.entity.Customer;
/**
 * 
 * Dao
 * JpaRepository<实体类，主键类型>
 * 	封装了基本的crud
 * JpaSpecificationExecutor<实体类>
 * 	封装了复制查询（分页）
 * @author jzx
 *
 */
public interface CustomerDao extends JpaRepository<Customer, Long>,JpaSpecificationExecutor<Customer> {
	
	
	
	public List<Customer> findAll();
	
	public Customer findByCustId(Long id);
	
}
