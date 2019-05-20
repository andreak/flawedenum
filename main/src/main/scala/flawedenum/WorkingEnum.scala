package flawedenum

import flawedenum.macros.EnumerationMacros._

sealed abstract class WorkingEnum {
	val name = toString
}

object WorkingEnum {
	val values = sealedInstancesOf[WorkingEnum]
	case object enum_one extends WorkingEnum
	case object enum_two extends WorkingEnum
}
