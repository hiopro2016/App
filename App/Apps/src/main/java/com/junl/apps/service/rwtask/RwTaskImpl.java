package com.junl.apps.service.rwtask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junl.apps.common.PageInfoSetCondition;
import com.junl.apps.form.RWTaskForm;
import com.junl.apps.mapper.RWTaskMapper;
import com.junl.frame.core.common.page.PageInfo;



@Service
public class RwTaskImpl implements IRwTask{

	
	
	@Autowired
	private RWTaskMapper mapper;
	
	/*
	 * (non-Javadoc)
	 * @see com.junl.apps.service.rwtask.IRwTask#queryRWTaskListPage(com.junl.apps.form.RWTaskForm)
	 */
	public PageInfo queryRWTaskListPage(RWTaskForm form) throws Exception {
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("sdate", form.getSdate());
		params.put("edate", form.getEdate());
		params.put("fuZeRen", form.getFuZeRen());
		params.put("wxmkId", form.getWxmkId());
		params.put("taskRelateState", form.getTaskRelateState());
		params.put("notInTaskIds", form.getNotInTaskIds());
		params.put("oversdate", form.getOversdate());
		params.put("overedate", form.getOveredate());
		PageInfoSetCondition.SetCondition(form.getPageInfo(), "paiDanDate", "desc");
		//设置分页参数
		params.put("page", form.getPageInfo());
		List<Map<String, Object>> list = mapper.queryRWTaskListPage(params);
		form.getPageInfo().setResults(list);
		return form.getPageInfo();
	}

	/**
	 *  更新任务的状态
	 */
	public int updateTask(Map<String, Object> map) throws Exception {
		return mapper.updateTask(map);
	}

	/**
	 *  根据子任务的ids获取任务的信息
	 */
	public Map<String, Object> queryRWByTaskInfoRelate(String taskInfoRelate) throws Exception {
		Map<String, Object> map =new HashMap<String, Object>();
		map.put("taskInfoRelate", taskInfoRelate);
		return mapper.queryRWByTaskInfoRelate(map);
	}
	
	
	

	
	
	
	
	
	
	
	
	
	

	
	

}
