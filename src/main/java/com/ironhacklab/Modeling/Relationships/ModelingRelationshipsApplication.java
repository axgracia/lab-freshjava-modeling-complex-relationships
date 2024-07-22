package com.ironhacklab.Modeling.Relationships;

import com.ironhacklab.Modeling.Relationships.model.Chapter;
import com.ironhacklab.Modeling.Relationships.model.Member;
import com.ironhacklab.Modeling.Relationships.model.Status;
import com.ironhacklab.Modeling.Relationships.repository.ChapterRepository;
import com.ironhacklab.Modeling.Relationships.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.util.Arrays;

@SpringBootApplication
public class ModelingRelationshipsApplication implements CommandLineRunner {

	@Autowired
	private ChapterRepository chapterRepository;

	@Autowired
	private MemberRepository memberRepository;
    private String renewalDate;

	@Override
	public void run(String... args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM / dd / yyyy");

		void main; (String[] args) -> {
		SpringApplication.run(ModelingRelationshipsApplication.class, args);
	}

        public void run(String... args) throws Exception {
		// Create sample members
		Member president1 = new Member();
		president1.setName("President One");
		president1.setStatus(Status.ACTIVE);
		president1.setRenewalDate(sdf.parse("8 / 15 / 2024"));

		Member member1 = new Member();
		member1.setName("Member One");
		member1.setStatus(Status.ACTIVE);
		member1.setRenewalDate(sdf.parse("9 / 10 / 2024"));

		Member member2 = new Member();
		member2.setName("Member Two");
		member2.setStatus(Status.LAPSED);
		member2.setRenewalDate(sdf.parse("10 / 17 / 2024"));

		// Save members
		memberRepository.saveAll(Arrays.asList(president1, member1, member2));

		// Create chapter
		Chapter chapter1 = new Chapter();
		chapter1.setName("Chapter One");
		chapter1.setDistrict("District One");
		chapter1.setPresident(member2);
		chapter1.setMembers(Arrays.asList(member1, member2));

		// Save chapter
		chapterRepository.save(chapter1);

		// Repeat for other chapters...
	}
}
