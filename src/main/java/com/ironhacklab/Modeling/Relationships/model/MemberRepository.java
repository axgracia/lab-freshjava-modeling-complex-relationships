package com.ironhacklab.Modeling.Relationships.model;

import com.ironhacklab.Modeling.Relationships.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long>{
}
