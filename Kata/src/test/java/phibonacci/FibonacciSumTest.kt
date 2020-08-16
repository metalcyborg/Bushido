package phibonacci

import com.google.common.truth.Truth
import org.junit.Before
import org.junit.Test
import java.math.BigInteger

class FibonacciSumTest {
    lateinit var fibonacci: FibonacciSum

    @Before
    fun setUp() {
        fibonacci = FibonacciSum()
    }

    @Test(expected = IllegalArgumentException::class)
    fun `throw exception if n is negative number`() {
        fibonacci.getSum(-1)
    }

    @Test
    fun `sum of zero items`() {
        Truth.assertThat(fibonacci.getSum(0)).isEqualTo(BigInteger.ZERO)
    }

    @Test
    fun `sum of one item`() {
        Truth.assertThat(fibonacci.getSum(1)).isEqualTo(BigInteger.ZERO)
    }

    @Test
    fun `sum of two items`() {
        Truth.assertThat(fibonacci.getSum(2)).isEqualTo(BigInteger.ONE)
    }

    @Test
    fun `sum of three items`() {
        Truth.assertThat(fibonacci.getSum(3)).isEqualTo(BigInteger.TWO)
    }

    @Test
    fun `sum of four items`() {
        Truth.assertThat(fibonacci.getSum(4)).isEqualTo(BigInteger.valueOf(4))
    }

    @Test
    fun `sum of ten items`() {
        Truth.assertThat(fibonacci.getSum(10)).isEqualTo(BigInteger.valueOf(88))
    }

    @Test
    fun `sum of 50 items`() {
        Truth.assertThat(fibonacci.getSum(50)).isEqualTo(BigInteger.valueOf(20_365_011_073L))
    }

    @Test
    fun `sum of 100 items`() {
        Truth.assertThat(fibonacci.getSum(100)).isEqualTo(BigInteger("573147844013817084100"))
    }

    @Test
    fun `sum of 10000 items`() {
        Truth.assertThat(fibonacci.getSum(10000)).isEqualTo(BigInteger("544383731135652813387342609937503801" +
                "35389184554695967026247715841208582865622349017083051547938960541173822675978026317384359584751116" +
                "24143917470264295916992558633411790606304808979353147610846625907275936789915067796008830659796664" +
                "19658249377218003814411588410424809979846964873753371800281637633177819279411013692627509795098007" +
                "13596718023814710669912644214775254478587674568963808002962265133111359929762726679441400101575800" +
                "04351077746593580536250246170791805922641467900569075232189586814236784959388075642348375438634263" +
                "96359707337562600989624626687461120417398194048750624437098686543156268471861956201461266422327118" +
                "15040367018825205314845875817193533529827837800351902529239517836689467661917953884712441028463935" +
                "44948461445077876252952096188759727288922076853739647586954315917243453719361126374392633731300589" +
                "61672480517379863063681150030883967495871026195246313524474995052041983051871683216232838597946272" +
                "45919771454628218399695789223798912199431775469705216131081096559950638297261253848242007897109054" +
                "75402843814961193046506186617012298328896435273375079278606944476185352514442107792804597990456129" +
                "81294238091560550330323389196091622366987599227829231918966880177185755555209946533201284465023711" +
                "53715141749290913104897203455577507196645425232862022019506091483585223882711016708433051169942115" +
                "77515125551025165593188816404834412955703882547752111157739578011586839707260256561482495646053870" +
                "02803313118614853998053970315557275296933995860798503815814462764338588285295358034248508454264464" +
                "71681531001533180479567436396815653326152509571127480411928196022148849148284389124178520174507305" +
                "53892871785792350941774338333150689823935442198880542933244037119486721554357654856549913451927109" +
                "89198026651845649278278272129576492402355075955582056475693653948733176590002063731265706435097094" +
                "82649710038733517477713403319028105575667931789470024118803094604034362953471997461392274791549730" +
                "35641263307423082405199999610154978466734045832685296038830112076562924599813625165234709396304973" +
                "4046445106365304163630823669242257761468288461791843224793434406079917883360676846711185597500"))
    }
}