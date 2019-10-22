package com.church.members.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Date;

import com.church.members.entity.Member;

public class MemberService {
	
	List<Member> members = new ArrayList<>(
			
			Arrays.asList( 
					
					new  Member("183", "Vinod", "", "Abraham", null,
							"M", "M", "Blk 173A #06-587 Punggol Field","821173", "NE",
							"97345259", "63436121", "vabraham@gmail.com", "Primary", "A",
							"Y"),
					new  Member("183", "Sinu", "", "Mathews", null,
							"M", "F", "Blk 173A #06-587 Punggol Field","821173", "NE",
							"97345259", "63436121", "vabraham@gmail.com", "Primary", "A",
							"Y")
			
			);
		
		 
		

	
	public void addMember(Member member) {	
	}

	public void updateMember(Member member) {	
	}

	public void deleteMember(Member member) {	
	}

	
}
