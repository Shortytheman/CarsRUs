package dat3.members.repository;

import dat3.cars.entity.Member;
import dat3.cars.repository.MemberRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class MemberRepositoryTest {

  @Autowired
  MemberRepository memberRepository;

  static String m1UserName;
  static String m2UserName;


  @BeforeAll
  public static void setupData(@Autowired MemberRepository memberRepository){
    Member m1 = new Member("aa","aa","aa","aa");
    Member m2 = new Member("bb","bb","bb","bb");
    memberRepository.save(m1);
    memberRepository.save(m2);
    m1UserName = m1.getUsername();
    m2UserName = m2.getUsername();
  }

  @Test
  void testUsername(){
  Member found = memberRepository.findById(m1UserName).get();
  assertEquals(m1UserName,found.getUsername());
  }

  @Test
  public void findByEmail() {
    Member found = memberRepository.findMemberByEmail("bb");
    assertEquals("bb",found.getEmail());
  }

}