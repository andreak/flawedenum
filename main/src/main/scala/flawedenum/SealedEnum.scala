package flawedenum


abstract class SealedEnum[E <: SealedEnumValue] {
	val values: Set[E]
	final def valueOf(value: String): E = values.find(_.name == value).get
}

abstract class SealedEnumValue {
	val name = toString
}
