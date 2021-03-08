package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

    private MemberService memberService;
    private OrderService orderService;

    @BeforeEach
    void beforeAll() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    public void 주문생성() {
        // given
        Member member1 = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member1);
        // when
        Order order1 = orderService.createOrder(1L, "pencil", 10000);
        System.out.println("order1 = " + order1);
        // then
        Assertions.assertThat(order1.calculatePrice()).isEqualTo(9000);
    }
}