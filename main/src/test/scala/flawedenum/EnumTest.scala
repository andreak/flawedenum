package flawedenum

import org.testng.Assert
import org.testng.annotations.Test

@Test
class EnumTest {

	def testWorkingEnums(): Unit = {
		println(WorkingEnum.enum_one)
		WorkingEnum.values.zipWithIndex.foreach{ case(enumValue,idx) =>
			Assert.assertNotNull(enumValue)
			println(s"$idx $enumValue")
		}
	}

	def testGarbeledEnum(): Unit = {
		println(GarbeledEnum.flawed_one) // Commenting out this makes this test pass, why?
		GarbeledEnum.values.zipWithIndex.foreach{ case(enumValue,idx) =>
			Assert.assertNotNull(enumValue)
			println(s"$idx $enumValue")
		}
	}

}
