class Foo {
	def script

	Foo(script) {
		this.script = script
	}

	def printInfo(String message) {
		script.sh "echo foo -> ${message}"
	}
}
