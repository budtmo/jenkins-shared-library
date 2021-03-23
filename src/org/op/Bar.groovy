package org.op

import org.Foo

class Bar {
	def script
	Foo myFoo

	Bar(script, Foo myFoo) {
		this.script = script
		this.myFoo = myFoo
	}

	def getFoo() {
		return myFoo
	}
	
	def printInfo(String message) {
		script.sh "echo bar - ${message}"
	}
}
