package flawedenum

import flawedenum.macros.EnumerationMacros.sealedInstancesOf

sealed abstract class GarbeledEnum extends SealedEnumValue[GarbeledEnum]

object GarbeledEnum extends SealedEnum[GarbeledEnum] {
	val values = sealedInstancesOf[GarbeledEnum]
	case object flawed_one extends GarbeledEnum
	case object flawed_two extends GarbeledEnum
}
