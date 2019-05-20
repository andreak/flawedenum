package flawedenum

import org.testng.annotations.Test

@Test
class EnumTest {

	def testWorkingEnums(): Unit = {
		println(WorkingEnum.enum_one)
		WorkingEnum.values.zipWithIndex.foreach{ case(enumValue,idx) =>
			println(s"$idx $enumValue")
		}
	}

	def testGarbeledEnum(): Unit = {
		println(GarbeledEnum.flawed_one)
		GarbeledEnum.values.zipWithIndex.foreach{ case(enumValue,idx) =>
			println(s"$idx $enumValue")
		}
	}

}
