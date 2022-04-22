import kotlin.test.Test
import kotlin.test.assertEquals

internal class NameTest {

    private val testSample: GenerateName = GenerateName()

    @Test
    fun testAndroidNames() {
        val screenName = "Splash Screen"
        val data = testSample.takeTechScreenName(Techs.ANDROID,screenName)
        assertEquals( expected = "layout name ➝ activity_splash_screen.\n" +
                "controller name ➝ SplashScreenActivity.\n" +
                "model name ➝ SplashScreenModel." , actual = "layout name ➝ ${data[0]}.\n" +
                "controller name ➝ ${data[1]}.\n" +
                "model name ➝ ${data[2]}.")
    }

    @Test
    fun testFlutterNames() {
        val screenName = "Splash Screen"
        val data = testSample.takeTechScreenName(Techs.FLUTTER,screenName)
        assertEquals( expected = "layout name ➝ splash_screen.\n" +
                "controller name ➝ splash_controller.\n" +
                "model name ➝ splash_model." , actual = "layout name ➝ ${data[0]}.\n" +
                "controller name ➝ ${data[1]}.\n" +
                "model name ➝ ${data[2]}.")
    }

    @Test
    fun testIOSNames() {
        val screenName = "Splash Screen"
        val data = testSample.takeTechScreenName(Techs.IOS,screenName)
        assertEquals( expected = "view name ➝ SplashScreenView.\n" +
                "viewmodel name ➝ SplashScreenViewModel." , actual = "view name ➝ ${data[0]}.\n" +
                "viewmodel name ➝ ${data[1]}.")
    }
}
