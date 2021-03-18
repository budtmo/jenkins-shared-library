class Bar {
	def script

	Bar(script) {
		this.script = script
	}

	def printInfo(String message) {
		script.sh "echo bar - ${message}"
	}
}
