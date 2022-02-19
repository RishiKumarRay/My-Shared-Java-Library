def call(body) {
	node{
		sh 'mvn package'
	}
}	
