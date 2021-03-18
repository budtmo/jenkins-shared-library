class Bar {
	def script

	Foo(script) {
		this.script = script
	}

	def printInfo(String message) {
		script.sh "echo bar -> ${message}"
	}
}
