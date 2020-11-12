package com.minibean.timewizard.model.biz;

import java.util.List;

import com.minibean.timewizard.model.dto.UserInfoDto;

public interface UserInfoBiz {
	
	public List<UserInfoDto> selectList();
	public UserInfoDto selectOne(int user_no); /* session용 */
	public UserInfoDto selectOne(UserInfoDto dto); /* 기타용 */
	public UserInfoDto selectOne(String user_distinct); /* personal용 */
	public int insert(UserInfoDto dto);
	public int update(UserInfoDto dto);
	public int delete(int user_no);
	public int idCheck(String id);//아이디 중복체크 용도
	public int updateRoleRes(UserInfoDto dto);
	public int pwChangeRes(UserInfoDto dto);
	public int userInfoChange(UserInfoDto dto);
	
	//아이디 찾기
	public String findID(UserInfoDto dto);
	//비밀번호 찾기
	public String findPW(UserInfoDto dto);
}
