package xh.mybatis.mapper;

import java.util.List;
import java.util.Map;

public interface DispatchStatusMapper {
	
	/**
	 *调度台运行状态
	 * @return
	 * @throws Exception
	 */
	public List<Map<String,String>> dispatchstatus() throws Exception;
	
	/**
	 * 已经安装的调度台
	 * @return
	 * @throws Exception
	 */
	public List<Map<String,String>> dispatchSetup() throws Exception;
	
	/**
	 * 修改调度台状态
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int updateDispatchStatus(Map<String,String> map) throws Exception;

}
