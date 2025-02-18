SUMMARY = "Screen-scraping library"
HOMEPAGE = " https://www.crummy.com/software/BeautifulSoup/bs4"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96e0034f7c9443910c486773aa1ed9ac"

SRC_URI[sha256sum] = "74e3d1928edc070d21748185c46e3fb33490f22f52a3addee9aee0f4f7781051"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-html5lib \
    ${PYTHON_PN}-lxml \
    ${PYTHON_PN}-soupsieve \
    ${PYTHON_PN}-html \
    ${PYTHON_PN}-logging \
"

BBCLASSEXTEND = "native nativesdk"
