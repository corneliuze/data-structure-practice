package arrays

object SubDomainVisitCount {

    fun subdomainVisits(cpdomains: Array<String>): List<String> {
        val domainMap = mutableMapOf<String, Int>()
        val answer = mutableListOf<String>()

        for (cpdomain in cpdomains) {
            val domain = cpdomain.split("\\s".toRegex()).toTypedArray()
            val count = domain[0].toInt()
            var url = domain[1]
            val urls = url.split(".")
            var index = urls.lastIndex
            url = urls[index]
            while (true) {
                domainMap[url] = domainMap[url]?.plus(count) ?: (0 + count)
                index -= 1
                if(index == -1) break
                url = "${urls[index]}.$url"
            }

        }
        for (key in domainMap.keys) {
            answer.add("${domainMap[key]} $key")
        }

        return answer
    }
}
