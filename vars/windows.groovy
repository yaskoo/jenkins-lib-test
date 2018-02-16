def call(Closure body) {

	withEnv(['LALA=land']) {
		body()	
	}
}

