package org.techhub.DemoJobPortalApp.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.techhub.DemoJobPortalApp.model.JobModel;
import org.techhub.DemoJobPortalApp.model.Product;

@Repository("jobRepository")
public class JobRepositoryImpl implements JobRepository {

	@Autowired
	JdbcTemplate template;

	List<JobModel> jobList;

	@Override
	public boolean isAddNewJob(final JobModel model) {
		// TODO Auto-generated method stub
		int val = template.update("insert into addnewjob values('0',?,?,?,?,?)", new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, model.getName());
				ps.setString(2, model.getPack());
				ps.setString(3, model.getLocation());
				ps.setString(4, model.getDesc());
				ps.setDate(5, model.getLasttoapply());
				// ps.setDat

			}

		});
		if (val > 0) {
			return true;
		} else {
			return false;
		}

	}

	public List<JobModel> getJobs() {
		jobList = template.query("select *from addnewjob", new RowMapper<JobModel>() {

			@Override
			public JobModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				JobModel model = new JobModel();
				model.setId(rs.getInt(1));
				model.setName(rs.getString(2));
				model.setPack(rs.getString(3));
				model.setLocation(rs.getString(4));
				model.setDesc(rs.getString(5));
				model.setLasttoapply(rs.getDate(6));

				return model;
			}

		});
		return jobList;
	}

	@Override
	public boolean isDeleteCompany(final Integer cid) {
		// TODO Auto-generated method stub
		int value=template.update("delete from addnewjob where jid=?",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setInt(1, cid);
			}
			
		});
		if(value>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		 
	}

	@Override
	public boolean isUpdateCompany(final JobModel model) {
		// TODO Auto-generated method stub
		int value=template.update("update addnewjob set company=?,pack=?,loc=?,description=?,ldate=? where jid=?", new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				
				ps.setString(1,model.getName());
				ps.setString(2,model.getPack());
				ps.setString(3,model.getLocation());
				ps.setString(4, model.getDesc());
				ps.setDate(5,model.getLasttoapply());
				ps.setInt(6,model.getId());
			}
			
		});
		if(value>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	@Override
	public List<Product> getProductByName(String name) {
		// TODO Auto-generated method stub
		List <Product>list=template.query("select *from product where name like '%"+name+"%'",new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Product p = new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getInt(3));
				p.setCompany(rs.getString(4));
				return p;
			}
			
		});
		return list;
	}

}










