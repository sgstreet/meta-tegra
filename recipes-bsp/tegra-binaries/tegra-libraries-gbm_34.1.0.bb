L4T_DEB_COPYRIGHT_MD5 = "fab0c15b4bbf7f8d5ac2bd6673d4211c"
DEPENDS = "libdrm patchelf-native"

L4T_DEB_TRANSLATED_BPN = "nvidia-l4t-core"

require tegra-debian-libraries-common.inc

LICENSE += "& BSD-3-Clause"
LIC_FILES_CHKSUM += "file://usr/share/doc/nvidia-tegra/LICENSE.minigbm;md5=72f855f00b364ec8bdc025e1a36b39c3"

<<<<<<<< HEAD:recipes-bsp/tegra-binaries/tegra-libraries-gbm_32.7.2.bb
MAINSUM = "41845dade9d3e1cd67be7875e0634167de414678f088d4c6342ccd696894e63e"
MAINSUM:tegra210 = "553a56f565e0ac9659a6633c3fe07afc3e68fad4451bcec9b651a929c0e986c5"
========
MAINSUM = "da997f39c1e66d5d8ceeca6e4ee33a3e9951237c1238ea51df25c7d8e10c65a7"
>>>>>>>> 390a51f3 (tegra-binaries: update for 34.1.0):recipes-bsp/tegra-binaries/tegra-libraries-gbm_34.1.0.bb

TEGRA_LIBRARIES_TO_INSTALL = "\
    tegra/libnvgbm.so \
"

do_install:append() {
    patchelf --set-soname libnvgbm.so.1 ${D}${libdir}/libnvgbm.so
}

DEBIAN_NOAUTONAME:${PN} = "1"
DEBIAN_NOAUTONAME:${PN}-dev = "1"
DEBIAN_NOAUTONAME:${PN}-dbg = "1"
FILES_SOLIBSDEV = ""
SOLIBS = ".so*"
RRECOMMENDS:${PN} = "kernel-module-nvgpu"