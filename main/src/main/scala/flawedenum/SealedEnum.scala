package flawedenum


abstract class SealedEnum[E <: SealedEnumValue[E]] {
	val values: Set[E]
	final def valueOf(value: String): E = values.find(_.name == value).get
}

abstract class SealedEnumValue[T <: SealedEnumValue[T]](et: SealedEnum[T]) { // This constructor-arguments makes values return null as first element, why??
	val name = toString
}
