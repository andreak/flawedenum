package flawedenum


abstract class SealedEnum[E <: SealedEnumValue[E]] {
	val values: Set[E]
	final def valueOf(value: String): E = values.find(_.name == value).get
}

abstract class SealedEnumValue[T <: SealedEnumValue[T]] {
	val name = toString
}
