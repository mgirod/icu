// © 2017 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
package com.ibm.icu.dev.test.number;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.ibm.icu.dev.impl.number
	* include/Makefile.in: Regenerated.
	* testsuite/Makefile.in: Regenerated.

2013-12-21  Andreas Tobler  <andreast@gcc.gnu.org>

	* include/private/gcconfig.h: Add FreeBSD powerpc64 defines.

2013-09-20  Alan Modra  <amodra@gmail.com>

	* configure: Regenerate.

2013-09-04  Matthias Klose  <doko@ubuntu.com>

	* Makefile.am (libgcjgc_la_LIBADD): Add EXTRA_TEST_LIBS.
	* Makefile.in: Regenerate.

2013-03-16  Yvan Roux <yvan.roux@linaro.org>

	* include/private/gcconfig.h (AARCH64): New macro (defined only if
	__aarch64__).
	(CPP_WORDSZ): Define for AArch64.
	(MACH_TYPE): Likewise.
	(ALIGNMENT): Likewise.
	(HBLKSIZE): Likewise.
	(OS_TYPE): Likewise.
	(LINUX_STACKBOTTOM): Likewise.
	(USE_GENERIC_PUSH_REGS): Likewise.
	(DYNAMIC_LOADING): Likewise.
	(DATASTART): Likewise.
	(DATAEND): Likewise.
	(STACKBOTTOM): Likewise.
	(NOSYS): Likewise.
	(mach_type_known): Define for AArch64 and comment update.

2013-03-06  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* os_dep.c [SOLARIS_STACKBOTTOM] (GC_solaris_stack_base): New
	function.
	[!BEOS && !AMIGA && !MSWIN32 && !MSWINCE && !OS2 && !NOSYS &&
	!ECOS] (GC_get_stack_base): Use it.
	* include/private/gcconfig.h [SPARC && SUNOS5]
	(SOLARIS_STACKBOTTOM): Define.
	(STACKBOTTOM, HEURISTIC2): Remove.
	[I386 && SUNOS5]
	(SOLARIS_STACKBOTTOM): Define.
	(STACKBOTTOM): Remove.

2012-11-04  Samuel Thibault  <samuel.thibault@gnu.org>

	* configure.ac: Add stanza for *-*-gnu* threads configuration.
	* configure: Regenerate.
	* include/gc_config.h.in: Likewise.
	* dyn_load.c (_GNU_SOURCE): Define for __GNU__.
	* include/gc_config_macros.h (_REENTRANT, GC_PTHREADS): Define for
	GC_GNU_THREADS.
	* include/private/gcconfig.h (DATASTART): Don't define for I386 &&
	HURD.
	(SIG_SUSPEND, SIG_THR_RESTART, SEARCH_FOR_DATA_START): Define for
	I386 && HURD.
	(UNIX_LIKE, REGISTER_LIBRARIES_EARLY): Define for HURD.
	* os_dep.c (GC_init_linux_data_start): Handle for HURD.
	* pthread_support.c (GC_thr_init): Add case for GC_GNU_THREADS.
	* specific.c: Use for GC_GNU_THREADS.
	* threadlibs.c: Add case for GC_GNU_THREADS.

2012-09-14  David Edelsohn  <dje.gcc@gmail.com>

	* configure: Regenerated.

2012-05-16  H.J. Lu  <hongjiu.lu@intel.com>

	* configure: Regenerated.

2012-05-11  H.J. Lu  <hongjiu.lu@intel.com>

	Merge upstream changes
	* include/private/gcconfig.h: (ALIGNMENT): Set to 4 for x32.
	(CPP_WORDSZ): Set to 32 for x32.

2012-02-27  Jack Howarth  <howarth@bromo.med.uc.edu>
	    Patrick Marlier  <patrick.marlier@gmail.com>

	PR boehm-gc/48299
	* testsuite/boehm-gc.c/thread_leak_test.c: Merge upstream changes.

2012-02-23  Patrick Marlier  <patrick.marlier@gmail.com>
	    Jack Howarth  <howarth@bromo.med.uc.edu>

	PR boehm-gc/52179
	* include/gc_config.h.in: Undefine HAVE_PTHREAD_GET_STACKADDR_NP.
	* include/private/gcconfig.h (DARWIN): Define STACKBOTTOM with
	pthread_get_stackaddr_np when available.
	* configure.ac (THREADS): Check availability of pthread_get_stackaddr_np.
	* configure: Regenerate.

2012-02-10  Kai Tietz  <ktietz@redhat.com>

	PR boehm-gc/48514
	* include/gc_config_macros.h (GC_DLL): Define it for mingw-targets
	only, if we are actual in boehm-gc's build and DLL_EXPORT
	is defined.

2011-11-21  Andreas Tobler  <andreast@fgznet.ch>

	* configure: Regenerate.

2011-08-08  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* configure.ac (THREADS): Remove posix95.
	* configure: Regenerate.

2011-07-07  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	PR target/39150
	* configure.ac (i?86-*-solaris2.[89]): Also accept
	x86_64-*-solaris2.1?.
	* configure: Regenerate.

2011-06-29  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	PR libgcj/49451
	* include/private/gcconfig.h [IRIX5 && _MIPS_SZPTR == 64]
	(ELF_CLASS): Define.
	* dyn_load.c [IRIX5]: Include <elf.h>.
	Include <obj.h> for O32, <objlist.h> for N32, N64.
	[SUNOS5DL && USE_PROC_FOR_LIBRARIES] (obj_offset): Define.
	[SUNOS4 && USE_PROC_FOR_LIBRARIES] (obj_offset): Define.
	[IRIX5 && !USE_PROC_FOR_LIBRARIES] (struct link_map): Define.
	(__rld_obj_head): Declare.
	(l_next, l_addr, obj_offset): Define.
	(GC_FirstDLOpenedLinkMap): New function.
	[SUNOS4 || SUNOS5DL] (GC_register_dynamic_libraries): Also use on
	IRIX5.
	Use obj_offset.
	[IRIX5 || (USE_PROC_FOR_LIBRARIES && !LINUX]
	(GC_register_dynamic_libraries): Don't use /proc version on IRIX5.

2011-04-19  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* configure.ac (THREADS): Remove decosf1, irix, mach, os2.
	* configure: Regenerate

2011-04-06  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	PR testsuite/48480
	* testsuite/lib/boehm-gc.exp (boehm-gc-dg-prune): Allow for path
	to ranlib.

2011-03-25  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	PR boehm-gc/11412
	* configure.ac (THREADCFLAGS): New variable.
	Use it instead of INCLUDES, AM_CPPFLAGS.
	<*-*-kfreebsd*-gnu> (THREADDLLIBS): Rename to THREADLIBS.
	Remove DG/UX support.
	(AC_CONFIG_FILES): Add testsuite/Makefile.
	* Makefile.am (AUTOMAKE_OPTIONS): Use foreign instead of cygnus.
	(SUBDIRS): Add testsuite.
	(libgcjgc_la_LIBADD): Remove $(UNWINDLIBS).
	(AM_CXXFLAGS): Add $(THREADCFLAGS).
	(AM_CFLAGS): Likewise.
	Remove TESTS related variables.
	* Makefile.in: Regenerate.
	* configure: Regenerate.
	* testsuite/Makefile.am: New file.
	* testsuite/Makefile.in: New file.
	* testsuite/lib/boehm-gc.exp: New file.
	* testsuite/config/default.exp: New file.
	* testsuite/boehm-gc.c/c.exp: New file.
	* testsuite/boehm-gc.lib/lib.exp: New file.
	* tests/test.c: Move ...
	* testsuite/boehm-gc.c/gctest.c: ... here.
	* tests/leak_test.c, tests/middle.c, tests/thread_leak_test.c,
	tests/trace_test.c: Move ...
	* testsuite/boehm-gc.c: ... here.
	* testsuite/boehm-gc.c/trace_test.c: Skip everywhere.
	* tests/staticrootslib.c, tests/staticrootstest.c: Move ...
	* testsuite/boehm-gc.lib: ... here.
	* testsuite/boehm-gc.lib/staticrootstest.c: Use dg-add-shlib
	staticrootslib.c.
	* tests/test_cpp.cc: Move ...
	* testsuite/boehm-gc.c++: ... here.

2011-03-21  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* configure.ac (THREADS): Remove solaris.
	* configure: Regenerate.

2011-02-13  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* configure: Regenerate.

2011-02-02  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* configure.ac: Don't use libdl on mips-sgi-irix6*.
	* configure: Regenerate.

2011-01-31  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* configure.ac (*-*-solaris2*): Add -lrt to THREADLIBS.
	* configure: Regenerate.

2010-12-10  Iain Sandoe  <iains@gcc.gnu.org>

	* powerpc_darwin_mach_dep.s:  Update for m64.  Add eh frames.
	Do not build or use the picsymbol stub for Darwin >= 9.
	* tests/test.c (reverse_test):  Modify count for ppc64-darwin.
	* pthread_support.c (GC_get_thread_stack_base): Correct a debug
	statement.

2010-11-29  Iain Sandoe  <iains@gcc.gnu.org>
	    Mike Stump  <mrs@gcc.gnu.org>

	PR target/26427
	PR target/33120
	PR testsuite/35710
	* dyn_load.c (GC_register_dynamic_libraries/DARWIN):  Add new writable
	data section names.
	(GC_dyld_name_for_hdr): Adjust layout.
	(GC_dyld_image_add): Adjust layout, add new Darwin sections, adjust
	debug to name the sections.
	(GC_dyld_image_remove): Adjust layout, remove new Darwin sections,
	adjust debug to name the sections.
	(GC_register_dynamic_libraries): Adjust layout.
	(GC_init_dyld): Likewise.
	(GC_register_main_static_data): Likewise.

2010-10-29  Paolo Bonzini  <bonzini@gnu.org>

	* configure: Regenerate.

2010-10-28  Paolo Bonzini  <bonzini@gnu.org>

	* configure.ac: Rewrite DGUX check to use GC_CFLAGS, and -O0 check
	to remove the need for MY_CFLAGS.
	* Makefile.am: Do not use @...@ substitutions.  Use AM_CXXFLAGS,
	AM_CFLAGS and AM_LDFLAGS instead of redefining LTCOMPILE and LINK.
	Use "override" to disable -O2 when required.
	* configure: Regenerate.
	* Makefile.in: Regenerate.
	* include/Makefile.in: Regenerate.

2010-10-11  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* dyn_load.c: Fix typo.
	* pthread_support.c (GC_get_thread_stack_base) [DEBUG_THREADS]:
	Use GC_printf0.

2010-06-15  Rainer Orth  <ro@CeBiTec.Uni-Bielefeld.DE>

	* configure.ac (*-*-solaris2.8*): Only usr alternate thread
	library on Solaris 8.
	(*-*-solaris2*): Use regular thread library otherwise.
	* configure: Regenerate.

2010-05-13  Uros Bizjak  <ubizjak@gmail.com>

	* tests/leak_test.c (main): Declare as int.  Return 0.
	* tests/thread_leak_test.c (main): Ditto.
	* tests/trace_test.c (main): Ditto.

2010-05-06  Dave Korn  <dave.korn.cygwin@gmail.com>

	PR target/42811
	* tests/staticrootstest.c: New test source file.
	* tests/staticrootslib.c: New test library source file.
	* Makefile.am (test_ldadd): New variable.
	(gctest_LDADD): Use it.
	(TESTS): Add leaktest, middletest and staticrootstest.
	(check_PROGRAMS): Likewise.
	(leaktest_SOURCES): New libtool variable definition.
	(leaktest_LDADD): Likewise.
	(leaktest_LDFLAGS): Likewise.
	(leaktest_LINK): Likewise.
	(middletest_SOURCES): Likewise.
	(middletest_LDADD): Likewise.
	(middletest_LDFLAGS): Likewise.
	(middletest_LINK): Likewise.
	(staticrootstest_SOURCES): Likewise.
	(staticrootstest_LDADD): Likewise.
	(staticrootstest_LDFLAGS): Likewise.
	(staticrootstest_LINK): Likewise.
	(check_LTLIBRARIES): Likewise.
	(libstaticrootslib_la_SOURCES): Likewise.
	(libstaticrootslib_la_LIBADD): Likewise.
	(libstaticrootslib_la_LDFLAGS): Likewise.
	(libstaticrootslib_la_DEPENDENCIES): Likewise.
	* Makefile.in: Regenerate.

2010-04-02  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* Makefile.in: Regenerate.
	* aclocal.m4: Regenerate.
	* include/Makefile.in: Regenerate.

2010-03-21  Dave Korn  <dave.korn.cygwin@gmail.com>

	PR target/42811 (prerequisite)
	* include/private/gc_priv.h (struct roots) [CYGWIN32]: Don't
	declare r_next member on Cygwin as on other windows hosts.
	(LOG_RT_SIZE) [CYGWIN32]: Don't define likewise.
	(RT_SIZE) [CYGWIN32]: Likewise.
	(struct _GC_arrays) [CYGWIN32]: Do declare _heap_bases[] member
	likewise.
	(GC_heap_bases) [CYGWIN32]: Do define likewise.
	(struct _SYSTEM_INFO) [CYGWIN32]: Do forward-declare likewise.
	(GC_sysinfo) [CYGWIN32]: Do declare extern likewise.
	(GC_n_heap_bases) [CYGWIN32]: Likewise.
	(GC_is_tmp_root) [CYGWIN32]: Do prototype likewise.
	* include/private/gcconfig.h (GC_win32_get_mem) [CYGWIN32]: Likewise.
	(GET_MEM) [CYGWIN32]: Do define likewise.
	* boehm-gc/ptr_chck.c (GC_is_visible) [CYGWIN32]: Do handle dynamic
	registration likewise.
	* boehm-gc/os_dep.c (GC_setpagesize) [CYGWIN32]: Do define likewise.
	(GC_no_win32_dlls) [CYGWIN32]: Define as constant false, unlike
	other windows hosts.
	(GC_sysinfo) [CYGWIN32]: Define as on other windows hosts.
	(GC_n_heap_bases) [CYGWIN32]: Likewise.
	(GLOBAL_ALLOC_TEST) [CYGWIN32]: Likewise.
	(GC_win32_get_mem) [CYGWIN32]: Likewise, but wrapping GC_unix_get_mem
	rather than GlobalAlloc/VirtualAlloc.
	(GC_win32_free_heap) [CYGWIN32]: Likewise, but wrapping free instead
	of GlobalFree (even though the function body is optimised away).
	* boehm-gc/mark_rts.c (add_roots_to_index) [CYGWIN32]: Define as on
	other windows hosts.
	(GC_add_roots_inner) [CYGWIN32]: Avoid overlapping or adjacent
	intervals likewise.
	(GC_clear_roots) [CYGWIN32]: Clear GC_root_index[] likewise.
	(GC_rebuild_root_index) [CYGWIN32]: Define as on other windows hosts.
	(GC_remove_tmp_roots) [CYGWIN32]: Call it likewise.
	(GC_remove_roots) [CYGWIN32]: Don't define, as on other windows hosts.
	(GC_is_tmp_root) [CYGWIN32]: Define, as on other windows hosts.
	(GC_cond_register_dynamic_libraries) [CYGWIN32]: Handle temporary
	roots and dynamic registration likewise.
	* boehm-gc/dyn_load.c (GC_has_static_roots) [CYGWIN32]: Define as on
	other windows hosts.
	(GC_register_has_static_roots_callback) [CYGWIN32]: Likewise.
	(GC_cond_add_roots) [CYGWIN32]: Likewise.
	(GC_register_main_static_data) [CYGWIN32]: Define to always return
	false, as on MSWINCE
	(HAVE_REGISTER_MAIN_STATIC_DATA) [CYGWIN32]: Define as on other
	windows hosts.
	(GC_warn_fb) [CYGWIN32]: Likewise.
	(GC_disallow_ignore_fb) [CYGWIN32]: Likewise.
	(GC_ignore_fb_mb) [CYGWIN32]: Likewise.
	(GC_ignore_fb) [CYGWIN32]: Likewise.
	(is_frame_buffer) [CYGWIN32]: Likewise.
	(GC_dump_meminfo) [CYGWIN32]: Likewise.
	(GC_wnt) [CYGWIN32]: Define to constant true.
	(GC_register_dynamic_libraries) [CYGWIN32]: Define as on other
	windows hosts.

2009-12-09  Matthias Klose  <doko@ubuntu.com> 

	* include/private/gc_locks.h: For __ARM_EABI__ define
	GC_test_and_set  GC_clear to use the atomic builtins.

2009-12-05  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* Makefile.in: Regenerate.
	* configure: Regenerate.
	* include/Makefile.in: Regenerate.

2009-11-30  Ben Elliston  <bje@au.ibm.com>

	* mark_rts.c (GC_approx_sp): Use __builtin_frame_address when
	compiling with GCC rather than taking the address of a local
	variable.

2009-11-30  Ben Elliston  <bje@au.ibm.com>

	* os_dep.c: Use the POSIX signal API in preference to the BSD API.
	Generate a compilation error if neither the POSIX nor BSD APIs can
	be detected.

2009-09-11  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* Makefile.am (libgcjgc_la_LINK, gctest_LINK): New.
	(gctest_LDADD): Depend on libgcjgc.la instead of ./libgcjgc.la,
	so that library dependency resolution works with portable make.
	* Makefile.in: Regenerate.

2009-09-08  Alexandre Oliva  <aoliva@redhat.com>

	* configure: Rebuilt with modified libtool.m4.

2009-09-03  Loren J. Rittle  <ljrittle@acm.org>

	* dyn_load.c (HAVE_DL_ITERATE_PHDR): Break definition from use.
	Define for FreeBSD 7.0+.

2009-08-24  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* configure.ac (AC_PREREQ): Bump to 2.64.

2009-08-22  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* Makefile.am (install-html, install-pdf): Remove.
	* Makefile.in: Regenerate.

	* Makefile.in: Regenerate.
	* aclocal.m4: Regenerate.
	* configure: Regenerate.
	* include/Makefile.in: Regenerate.
	* include/gc_config.h.in: Regenerate.

2009-08-22  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* Makefile.am (LTCOMPILE, LTLINK): Add $(AM_LIBTOOLFLAGS)
	and $(LIBTOOLFLAGS).
	* Makefile.in: Regenerate.

2009-07-30  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* configure.ac (_AC_ARG_VAR_PRECIOUS): Use m4_rename_force.

2009-07-17  Michael Meissner  <meissner@linux.vnet.ibm.com>

	PR boehm-gc/40785
	* include/private/gc_locks.h (GC_test_and_set): If GCC 4.4, use
	the __sync_lock_test_and _set and __sync_lock_release builtins on
	the powerpc.  If not GCC 4.4, fix up the constraints so that it
	builds without error.
	(GC_clear): Ditto.

2009-07-17  Kai Tietz  <kai.tietz@onevision.com>

	* configure.ac: Add rule for mingw targets to add -DGC_BUILD=1 to
	cflags.
	* configure: Regenerated.

2009-05-17  Dave Korn  <dave.korn.cygwin@gmail.com>

	* win32_threads.c (GC_get_thread_stack_base):  Implement for Cygwin.

2009-03-01  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* configure: Regenerate.

2009-02-09  Mark Mitchell  <mark@codesourcery.com>

	* Makefile.am (LTLDFLAGS): New variable.
	(LINK): Use it.
	* Makefile.in: Regenerated.

2008-12-18  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* configure: Regenerate.

2008-09-26  Peter O'Gorman  <pogma@thewrittenword.com>
	    Steve Ellcey  <sje@cup.hp.com>

	* configure: Regenerate for new libtool.
	* Makefile.in: Ditto.
	* include/Makefile.in: Ditto.
	* aclocal.m4: Ditto.

2008-07-18  Matthias Klose  <doko@ubuntu.com> 
 
	* configure.ac (AC_CONFIG_FILES): Add threads.mk. 
	* threads.mk.in: New. 
	* Makefile.in, configure: Regenerate. 

2008-06-17  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* Makefile.in: Regenerate.
	* configure: Regenerate.
	* include/Makefile.in: Regenerate.
	* include/gc_config.h.in: Regenerate.

2008-04-18  Paolo Bonzini  <bonzini@gnu.org>

	PR bootstrap/35457
	* aclocal.m4: Regenerate.
	* configure: Regenerate.

2008-03-16  Ralf Wildenhues  <Ralf.Wildenhues@gmx.de>

	* aclocal.m4: Regenerate.
	* configure: Likewise.
	* Makefile.in: Likewise.
	* include/Makefile.in: Likewise.

2007-02-19  Andreas Tobler  <a.tobler@schweiz.org>

	* dyn_load.c (GC_dyld_image_add): Remove ifdef clause and use the macro
	GC_GETSECTBYNAME instead.
	* include/private/gc_priv.h: Define GC_GETSECTBYNAME according to the
	architecture (Darwin).

2008-01-26  Richard Sandiford  <rsandifo@nildram.co.uk>

	* include/private/gcconfig.h (HBLKSIZE): Define for MIPS.

2008-01-24  David Edelsohn  <edelsohn@gnu.org>

	* configure: Regenerate.

2007-10-10  John David Anglin  <dave.anglin@nrc-cnrc.gc.ca>

	PR boehm-gc/33442
	* pthread_support.c (GC_PTR GC_get_thread_stack_base): If stack grows
	up, return stack_addr instead of stack_addr - stack_size.

2007-08-14  David Daney  <ddaney@avtrex.com>

	* include/private/gcconfig.h: Handle mips64-linux n64 ABI.

2007-07-05  H.J. Lu  <hongjiu.lu@intel.com>

	* aclocal.m4: Regenerated.

2007-07-02  Rainer Orth  <ro@TechFak.Uni-Bielefeld.DE>

	PR boehm-gc/21940
	PR boehm-gc/21942
	* configure.ac (GC_SOLARIS_THREADS): Don't define on *-*-solaris*.
	Use alternate thread library in /usr/lib/lwp.
	* configure: Regenerate.
	* dyn_load.c: Use GC_SOLARIS_PTHREADS.
	* include/gc_config_macros.h (GC_SOLARIS_THREADS): Don't define.
	* include/private/gcconfig.h: Handle 64-bit Solaris 2/x86.
	(GC_SOLARIS_THREADS): Don't define.
	* include/private/solaris_threads.h: Remove.
	* pthread_support.c (GC_thr_init) [GC_SOLARIS_PTHREADS]: Determine
	GC_nprocs via sysconf().
	* Makefile.am (libgcjgc_la_SOURCES): Remove solaris_pthreads.c and
	solaris_threads.c.
	(gctest_LDADD): Use THREADLIBS instead of THREADDLLIBS.
	* Makefile.in: Regenerate.	 
	* solaris_pthreads.c: Remove.
	* solaris_threads.c: Remove.

2007-06-22  Jakub Jelinek  <jakub@redhat.com>

	* pthread_support.c (GC_get_thread_stack_base): Handle
	pthread_getattr_np failures.

2007-06-02  Paolo Bonzini  <bonzini@gnu.org>

	* configure: Regenerate.

2007-05-23  Steve Ellcey  <sje@cup.hp.com>

	* Makefile.in: Regenerate.
	* configure: Regenerate.
	* aclocal.m4: Regenerate.
	* include/Makefile.in: Regenerate.

2007-05-20  Andreas Tobler  <a.tobler@schweiz.org>

	* configure.ac: Introduce extra_ldflags_libgc. Use it for Darwin.
	* configure: Regenerate.
	* Makefile.am (libgc_la_LDFLAGS): Use extra_ldflags_libgc.
	* Makefile.in: Regenerate.
	* include/Makefile.in: Regenerate.
	* include/private/gcconfig.h: Enable MPROTECT_VDB for all Darwin
	targets. Remove comments. Prepare ppc64 support for Darwin.

2007-04-23  Keith Seitz  <keiths@redhat.com>

	* include/gc.h (GC_is_thread_suspended): Declare.
	* pthread_stop_world.c (GC_is_thread_suspended): New function.

2007-04-03  Jakub Jelinek  <jakub@redhat.com>

	* configure.ac (NO_EXECUTE_PERMISSION): Set by default.
	* configure: Rebuilt.

2007-03-07  Alexandre Oliva  <aoliva@redhat.com>

	* include/gc.h (GC_REGISTER_FINALIZER_UNREACHABLE): New.
	(GC_register_finalizer_unreachable): Declare.
	(GC_debug_register_finalizer_unreachable): Declare.
	* finalize.c (GC_unreachable_finalize_mark_proc): New.
	(GC_register_finalizer_unreachable): New.
	(GC_finalize): Handle it.
	* dbg_mlc.c (GC_debug_register_finalizer_unreachable): New.
	(GC_debug_register_finalizer_no_order): Fix whitespace.

2007-03-01  Brooks Moses  <brooks.moses@codesourcery.com>

	* Makefile.am: Add dummy install-pdf target.
	* Makefile.in: Regenerate

2007-02-05  Roman Zippel <zippel@linux-m68k.org>

	* boehm-gc/include/private/gcconfig.h: use LINUX_STACKBOTTOM so
	it works with Linux 2.6, reactivate MPROTECT_VDB
	* boehm-gc/pthread_stop_world.c: save all register
	on signal entry

2007-01-24  Andreas Tobler  <a.tobler@schweiz.org>

	* os_dep.c (defined(MPROTECT_VDB) && defined(DARWIN)): Moved recently
	added defines to include/private/gc_priv.h
	(catch_exception_raise): Added THREAD_FLD in exc_state for POWERPC too.
	* darwin_stop_world.c: Removed the above defines.
	* include/private/gc_priv.h: Moved definitions from darwin_stop_world.c
	and os_dep.c to here. Fixed THREAD definition fixes for ppc64.

2007-01-17  David Daney  <ddaney@avtrex.com>

	* configure.ac: Don't define NO_SIGSET and NO_DEBUGGING while
	cross-compiling.
	* configure: Regenerated.
	* include/gc_config.h.in: Regenerated.

2007-01-17  Mike Stump  <mrs@apple.com>

	* os_dep.c: Fix i686-apple-darwin9 builds.

2007-01-16  Jack Howarth  <howarth@bromo.med.uc.edu>

	* aclocal.m4: Regenerate to use multi.m4.
	* configure: Regenerate.
	* Makefile.in: Regenerate.

2007-01-17  Andreas Tobler  <a.tobler@schweiz.org>

	* include/gc_config.h.in: Regenerate.

2007-01-16  Petr Salinger  <Petr.Salinger@seznam.cz>

	* include/private/gcconfig.h: Handle amd64/x86-64 cpu under
	 GNU/kFreeBSD.
	* os_dep.c: Likewise.

2007-01-15  Andreas Tobler  <a.tobler@schweiz.org>

	* os_dep.c (defined(MPROTECT_VDB) && defined(DARWIN)): Adjust mail
	reference.
	(catch_exception_raise): Fix typo in the I386 exc_state.

2007-01-11  Andreas Tobler  <a.tobler@schweiz.org>

	* configure.ac: Replaced HAS_I386_THREAD_STATE_* with
	HAS_X86_THREAD_STATE32_* and HAS_X86_THREAD_STATE64_* respectively.
	* configure: Regenerated.
	* include/private/gcconfig.h (DARWIN): Added X86_64 define for Darwin.
	Added base definitions for the X86_64 Darwin port.
	* include/private/gc_priv.h: Added definitions for Darwin MACH thread
	operations. Moved existing THREAD_STATE info from darwin_stop_world.c.
	* darwin_stop_world.c: Removed THREAD_STATE info. Added
	HAS_X86_THREAD_STATE64___RAX. And replaced HAS_I386_THREAD_STATE___EAX
	with HAS_X86_THREAD_STATE32___EAX.
	(GC_push_all_stacks): Use GC_MACH_THREAD_STATE_COUNT. Add code for
	X86_64 Darwin.
	* dyn_load.c (GC_dyld_name_for_hdr): Use GC_MACH_HEADER.
	(GC_dyld_image_add): Use GC_MACH_HEADER and GC_MACH_SECTION.
	Distinguish between getsectbynamefromheader_64 and
	getsectbynamefromheader.
	(GC_dyld_image_remove): Likewise.
	* os_dep.c (GC_dirty_init): Use GC_MACH_THREAD_STATE.
	(catch_exception_raise): Introduce exception information for I386 and
	X86_64 Darwin. Add X86_64 for exc_state.faultvaddr.

2006-12-08  Mike Stump  <mrs@apple.com>

	* configure.ac: Fix x86 darwin builds.
	* darwin_stop_world.c: Likewise.
	* include/private/gcconfig.h: Likewise.
	* connfigure: Regenerate.
	
2006-09-26  Jack Howarth  <howarth@bromo.med.uc.edu>

	PR target/29180
	* darwin_stop_world.c: Make stack_start unsigned long.

2006-09-21  Sandro Tolaini  <tolaini@libero.it>

	* os_dep.c: Port to Darwin/i386
	* darwin_stop_world.c: Likewise
	* include/private/gcconfig.h: Likewise
	
2006-06-07  Petr Salinger  <Petr.Salinger@seznam.cz>

	* configure.ac: add support for GNU/kFreeBSD, accepted by upstream
	for gc 6.8.
	* dyn_load.c: Likewise.
	* include/gc.h: Likewise.
	* private/gcconfig.h: Likewise.
	* configure: Regenerate.
	* include/gc_config.h.in: Regenerate.

2006-09-14  Tom Tromey  <tromey@redhat.com>

	PR boehm-gc/29068.
	* misc.c (GC_init_inner): Don't use GC_get_thread_stack_base on
	Solaris.

2006-08-21  Bryce McKinlay  <mckinlay@redhat.com>
	
	PR libgcj/13212:
	* configure.ac: Check for pthread_getattr_np(). Remove
	GC_PTHREAD_SYM_VERSION detection.
	* include/gc.h (GC_register_my_thread, GC_unregister_my_thread,
	GC_get_thread_stack_base): New declarations.
	* pthread_support.c (GC_register_my_thread, GC_unregister_my_thread,
	GC_get_thread_stack_base): New functions.
	(GC_delete_thread): Don't try to free the first_thread.
	* misc.c (GC_init_inner): Use GC_get_thread_stack_base() if possible.
	(pthread_create_, constr): Removed.
	(pthread_create): Don't rename.
	* include/gc_ext_config.h.in: Rebuilt.
	* include/gc_pthread_redirects.h (pthread_create): Define 
	unconditionally.
	* include/gc_config.h.in: Rebuilt.
	* configure: Rebuilt.

2006-06-21  Keith Seitz  <keiths@redhat.com>

	* pthread_stop_world.c (GC_suspend_handler): Redirect to suspension
	routine if signal is received and thread is flagged SUSPENDED.
	(suspend_self): New function.
	(GC_suspend_thread): New function.
	(GC_resume_thread): New function.
	* include/gc.h (GC_suspend_thread): Declare.
	(GC_resumet_thread): Declare.
	* include/private/pthread_support.h (SUSPENDED): New GC_thread
	flag.

2006-06-20  Ranjit Mathew  <rmathew@gcc.gnu.org>
	
	Backport Windows 9x/ME VirtualQuery() fix from GC 6.7.
	* os_dep.c (GC_wnt): Define.
	(GC_init_win32): Set GC_wnt.
	* dyn_load.c (GC_register_dynamic_libraries): Consider MEM_PRIVATE
	sections also on Windows 9x/ME.

2006-06-02  Geoffrey Keating  <geoffk@apple.com>

	* configure.ac: Define HAS_PPC_THREAD_STATE_R0,
	HAS_PPC_THREAD_STATE___R0, HAS_PPC_THREAD_STATE64_R0,
	HAS_PPC_THREAD_STATE64___R0, HAS_I386_THREAD_STATE_EAX,
	HAS_I386_THREAD_STATE___EAX.
	* configure: Regenerate.
	* include/gc_config.h.in: Regenerate.
	* darwin_stop_world.c (PPC_RED_ZONE_SIZE): Use standard Darwin
	macro names to determine value.
	(THREAD_STATE): New.
	(THREAD_FLD): New.
	(GC_push_all_stacks): Use THREAD_STATE and THREAD_FLD in both versions.

2006-05-24  Carlos O'Donell  <carlos@codesourcery.com>

	* Makefile.am: Add install-html target. 
	* Makefile.in: Regenerate.
	* aclocal.m4: Regenerate.
	* include/Makefile.in: Regenerate.

2006-03-07  Andrew Haley  <aph@redhat.com>

	* dyn_load.c (GC_has_static_roots): Declare.
	(GC_register_dynlib_callback): Call GC_has_static_roots.

2006-04-11  Bryce McKinlay  <mckinlay@redhat.com>

	* darwin_stop_world.c (GC_push_all_stacks, GC_stop_world,
	GC_start_world): Call vm_deallocate to free act_list. Fix from
	Bruce Mitchener.

2006-03-24  Andreas Tobler  <a.tobler@schweiz.ch>
	John David Anglin  <dave.anglin@nrc-cnrc.gc.ca>

	* configure.ac (THREADS): Add REENTRANT for *-*-hpux11*.
	Warn about POSIX threads not being supported for *-*-hpux10*.
	* configure: Regenerate.

2006-02-09  Tom Tromey  <tromey@redhat.com>

	* pthread_support.c: Conditionally include dlfcn.h.

2006-02-06  Jakub Jelinek  <jakub@redhat.com>
	    Anthony Green  <green@redhat.com>
	    Tom Tromey  <tromey@redhat.com>

	* include/gc_ext_config.h.in: Added GC_PTHREAD_SYM_VERSION.
	* include/gc_config.h.in: Rebuilt.
	* include/gc_pthread_redirects.h (pthread_create): Conditionally
	define.
	* pthread_support.c (pthread_create_): New global.
	(constr): New function.
	(pthread_create): Conditionally renamed.
	* configure: Rebuilt.
	* configure.ac (GC_PTHREAD_SYM_VERSION): Define.

2006-02-04  Alan Modra  <amodra@bigpond.net.au>

	* include/private/gc_locks.h (GC_test_and_set <POWERPC>): Don't
	use broken 64-bit version.

2006-01-25  Andreas Tobler  <a.tobler@schweiz.ch>

	* darwin_stop_world.c: Change inline asm instruction to ld as ldz
	is wrong.

	* Makefile.am (asm_libgcjgc_sources): Rename to asm_libgcjgc_sources.
	* Makefile.in: Regenerate.

2006-01-25  Bryce McKinlay  <mckinlay@redhat.com>

	* include/private/gcconfig.h: Revert to GC 6.6 version, removing
	all local changes.

2006-01-24  Bryce McKinlay  <mckinlay@redhat.com>

	Import Boehm GC version 6.6.

2006-01-24  David Ayers  <d.ayers@inode.at>

	PR libobjc/13946
	* include/gc.h: Fix prototype declarations for bootstrap.

2005-11-01  Bryce McKinlay  <mckinlay@redhat.com>

	* include/private/gc_priv.h: Increase MAX_ROOT_SETS to 1024.

2005-09-15  Kazu Hirata  <kazu@codesourcery.com>

	* include/private/gc_locks.h (GC_test_and_set): Change the
	constraint of the first operand to '0'.

2005-09-06  Tom Tromey  <tromey@redhat.com>

	PR libgcj/23662:
	* include/private/gcconfig.h (LINUX_STACKBOTTOM): Use instead of
	HEURISTIC1 on ARM.

2005-07-17  SUGIOKA Toshinobu  <sugioka@itonet.co.jp>

	* include/private/gcconfig.h (sh-linux): Use LINUX_STACKBOTTOM.

2005-06-15  Andreas Tobler  <a.tobler@schweiz.ch>

	* os_dep.c: Add FreeBSD/PowerPC bits.
	(GC_SysVGetDataStart): Likewise.
	* include/private/gcconfig.h: Likewise.

2005-05-25  Andrew Haley  <aph@redhat.com>

	* include/private/
=======
import com.ibm.icu.dev.impl.number.DecimalQuantity_64BitBCD;
import com.ibm.icu.dev.impl.number.DecimalQuantity_ByteArrayBCD;
import com.ibm.icu.dev.impl.number.DecimalQuantity_SimpleStorage;
import com.ibm.icu.dev.test.TestFmwk;
import com.ibm.icu.impl.FormattedStringBuilder;
import com.ibm.icu.impl.number.DecimalFormatProperties;
import com.ibm.icu.impl.number.DecimalQuantity;
import com.ibm.icu.impl.number.DecimalQuantity_DualStorageBCD;
import com.ibm.icu.impl.number.RoundingUtils;
import com.ibm.icu.number.LocalizedNumberFormatter;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.CompactDecimalFormat.CompactStyle;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.util.ULocale;

@RunWith(JUnit4.class)
public class DecimalQuantityTest extends TestFmwk {

    @Ignore
    @Test
    public void testBehavior() throws ParseException {

        // Make a list of several formatters to test the behavior of DecimalQuantity.
        List<LocalizedNumberFormatter> formats = new ArrayList<>();

        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(ULocale.ENGLISH);

        DecimalFormatProperties properties = new DecimalFormatProperties();
        formats.add(
                NumberFormatter.fromDecimalFormat(properties, symbols, null).locale(ULocale.ENGLISH));

        properties = new DecimalFormatProperties().setMinimumSignificantDigits(3)
                .setMaximumSignificantDigits(3).setCompactStyle(CompactStyle.LONG);
        formats.add(
                NumberFormatter.fromDecimalFormat(properties, symbols, null).locale(ULocale.ENGLISH));

        properties = new DecimalFormatProperties().setMinimumExponentDigits(1).setMaximumIntegerDigits(3)
                .setMaximumFractionDigits(1);
        formats.add(
                NumberFormatter.fromDecimalFormat(properties, symbols, null).locale(ULocale.ENGLISH));

        properties = new DecimalFormatProperties().setRoundingIncrement(new BigDecimal("0.5"));
        formats.add(
                NumberFormatter.fromDecimalFormat(properties, symbols, null).locale(ULocale.ENGLISH));

        String[] cases = {
                "1.0",
                "2.01",
                "1234.56",
                "3000.0",
                "0.00026418",
                "0.01789261",
                "468160.0",
                "999000.0",
                "999900.0",
                "999990.0",
                "0.0",
                "12345678901.0",
                "-5193.48", };

        String[] hardCases = {
                "9999999999999900.0",
                "789000000000000000000000.0",
                "789123123567853156372158.0",
                "987654321987654321987654321987654321987654311987654321.0", };

        String[] doubleCases = {
                "512.0000000000017",
                "4095.9999999999977",
                "4095.999999999998",
                "4095.9999999999986",
                "4095.999999999999",
                "4095.9999999999995",
                "4096.000000000001",
                "4096.000000000002",
                "4096.000000000003",
                "4096.000000000004",
                "4096.000000000005",
                "4096.0000000000055",
                "4096.000000000006",
                "4096.000000000007", };

        int i = 0;
        for (String str : cases) {
            testDecimalQuantity(i++, str, formats, 0);
        }

        i = 0;
        for (String str : hardCases) {
            testDecimalQuantity(i++, str, formats, 1);
        }

        i = 0;
        for (String str : doubleCases) {
            testDecimalQuantity(i++, str, formats, 2);
        }
    }

    static void testDecimalQuantity(
            int t,
            String str,
            List<LocalizedNumberFormatter> formats,
            int mode) {
        if (mode == 2) {
            assertEquals("Double is not valid", Double.toString(Double.parseDouble(str)), str);
        }

        List<DecimalQuantity> qs = new ArrayList<>();
        BigDecimal d = new BigDecimal(str);
        qs.add(new DecimalQuantity_SimpleStorage(d));
        if (mode == 0)
            qs.add(new DecimalQuantity_64BitBCD(d));
        qs.add(new DecimalQuantity_ByteArrayBCD(d));
        qs.add(new DecimalQuantity_DualStorageBCD(d));

        if (new BigDecimal(Double.toString(d.doubleValue())).compareTo(d) == 0) {
            double dv = d.doubleValue();
            qs.add(new DecimalQuantity_SimpleStorage(dv));
            if (mode == 0)
                qs.add(new DecimalQuantity_64BitBCD(dv));
            qs.add(new DecimalQuantity_ByteArrayBCD(dv));
            qs.add(new DecimalQuantity_DualStorageBCD(dv));
        }

        if (new BigDecimal(Long.toString(d.longValue())).compareTo(d) == 0) {
            double lv = d.longValue();
            qs.add(new DecimalQuantity_SimpleStorage(lv));
            if (mode == 0)
                qs.add(new DecimalQuantity_64BitBCD(lv));
            qs.add(new DecimalQuantity_ByteArrayBCD(lv));
            qs.add(new DecimalQuantity_DualStorageBCD(lv));
        }

        testDecimalQuantityExpectedOutput(qs.get(0), str);

        if (qs.size() == 1) {
            return;
        }

        for (int i = 1; i < qs.size(); i++) {
            DecimalQuantity q0 = qs.get(0);
            DecimalQuantity q1 = qs.get(i);
            testDecimalQuantityExpectedOutput(q1, str);
            testDecimalQuantityRounding(q0, q1);
            testDecimalQuantityRoundingInterval(q0, q1);
            testDecimalQuantityMath(q0, q1);
            testDecimalQuantityWithFormats(q0, q1, formats);
        }
    }

    private static void testDecimalQuantityExpectedOutput(DecimalQuantity rq, String expected) {
        DecimalQuantity q0 = rq.createCopy();
        // Force an accurate double
        q0.roundToInfinity();
        q0.setMinInteger(1);
        q0.setMinFraction(1);
        String actual = q0.toPlainString();
        assertEquals("Unexpected output from simple string conversion (" + q0 + ")", expected, actual);
    }

    private static final MathContext MATH_CONTEXT_HALF_EVEN = new MathContext(0, RoundingMode.HALF_EVEN);
    private static final MathContext MATH_CONTEXT_CEILING = new MathContext(0, RoundingMode.CEILING);
    @SuppressWarnings("unused")
    private static final MathContext MATH_CONTEXT_FLOOR = new MathContext(0, RoundingMode.FLOOR);
    private static final MathContext MATH_CONTEXT_PRECISION = new MathContext(3, RoundingMode.HALF_UP);

    private static void testDecimalQuantityRounding(DecimalQuantity rq0, DecimalQuantity rq1) {
        DecimalQuantity q0 = rq0.createCopy();
        DecimalQuantity q1 = rq1.createCopy();
        q0.roundToMagnitude(-1, MATH_CONTEXT_HALF_EVEN);
        q1.roundToMagnitude(-1, MATH_CONTEXT_HALF_EVEN);
        testDecimalQuantityBehavior(q0, q1);

        q0 = rq0.createCopy();
        q1 = rq1.createCopy();
        q0.roundToMagnitude(-1, MATH_CONTEXT_CEILING);
        q1.roundToMagnitude(-1, MATH_CONTEXT_CEILING);
        testDecimalQuantityBehavior(q0, q1);

        q0 = rq0.createCopy();
        q1 = rq1.createCopy();
        q0.roundToMagnitude(-1, MATH_CONTEXT_PRECISION);
        q1.roundToMagnitude(-1, MATH_CONTEXT_PRECISION);
        testDecimalQuantityBehavior(q0, q1);
    }

    private static void testDecimalQuantityRoundingInterval(DecimalQuantity rq0, DecimalQuantity rq1) {
        DecimalQuantity q0 = rq0.createCopy();
        DecimalQuantity q1 = rq1.createCopy();
        q0.roundToIncrement(new BigDecimal("0.05"), MATH_CONTEXT_HALF_EVEN);
        q1.roundToIncrement(new BigDecimal("0.05"), MATH_CONTEXT_HALF_EVEN);
        testDecimalQuantityBehavior(q0, q1);

        q0 = rq0.createCopy();
        q1 = rq1.createCopy();
        q0.roundToIncrement(new BigDecimal("0.05"), MATH_CONTEXT_CEILING);
        q1.roundToIncrement(new BigDecimal("0.05"), MATH_CONTEXT_CEILING);
        testDecimalQuantityBehavior(q0, q1);
    }

    private static void testDecimalQuantityMath(DecimalQuantity rq0, DecimalQuantity rq1) {
        DecimalQuantity q0 = rq0.createCopy();
        DecimalQuantity q1 = rq1.createCopy();
        q0.adjustMagnitude(-3);
        q1.adjustMagnitude(-3);
        testDecimalQuantityBehavior(q0, q1);

        q0 = rq0.createCopy();
        q1 = rq1.createCopy();
        q0.multiplyBy(new BigDecimal("3.14159"));
        q1.multiplyBy(new BigDecimal("3.14159"));
        testDecimalQuantityBehavior(q0, q1);
    }

    private static void testDecimalQuantityWithFormats(
            DecimalQuantity rq0,
            DecimalQuantity rq1,
            List<LocalizedNumberFormatter> formats) {
        for (LocalizedNumberFormatter format : formats) {
            DecimalQuantity q0 = rq0.createCopy();
            DecimalQuantity q1 = rq1.createCopy();
            FormattedStringBuilder nsb1 = new FormattedStringBuilder();
            FormattedStringBuilder nsb2 = new FormattedStringBuilder();
            format.formatImpl(q0, nsb1);
            format.formatImpl(q1, nsb2);
            String s1 = nsb1.toString();
            String s2 = nsb2.toString();
            assertEquals("Different output from formatter (" + q0 + ", " + q1 + ")", s1, s2);
        }
    }

    private static void testDecimalQuantityBehavior(DecimalQuantity rq0, DecimalQuantity rq1) {
        DecimalQuantity q0 = rq0.createCopy();
        DecimalQuantity q1 = rq1.createCopy();

        assertEquals("Different sign (" + q0 + ", " + q1 + ")", q0.isNegative(), q1.isNegative());

        assertEquals("Different fingerprint (" + q0 + ", " + q1 + ")",
                q0.getPositionFingerprint(),
                q1.getPositionFingerprint());

        assertDoubleEquals("Different double values (" + q0 + ", " + q1 + ")",
                q0.toDouble(),
                q1.toDouble());

        assertBigDecimalEquals("Different BigDecimal values (" + q0 + ", " + q1 + ")",
                q0.toBigDecimal(),
                q1.toBigDecimal());

        q0.roundToInfinity();
        q1.roundToInfinity();

        assertEquals("Different lower display magnitude",
                q0.getLowerDisplayMagnitude(),
                q1.getLowerDisplayMagnitude());
        assertEquals("Different upper display magnitude",
                q0.getUpperDisplayMagnitude(),
                q1.getUpperDisplayMagnitude());

        for (int m = q0.getUpperDisplayMagnitude(); m >= q0.getLowerDisplayMagnitude(); m--) {
            assertEquals("Different digit at magnitude " + m + " (" + q0 + ", " + q1 + ")",
                    q0.getDigit(m),
                    q1.getDigit(m));
        }

        if (rq0 instanceof DecimalQuantity_DualStorageBCD) {
            String message = ((DecimalQuantity_DualStorageBCD) rq0).checkHealth();
            if (message != null)
                errln(message);
        }
        if (rq1 instanceof DecimalQuantity_DualStorageBCD) {
            String message = ((DecimalQuantity_DualStorageBCD) rq1).checkHealth();
            if (message != null)
                errln(message);
        }
    }

    @Test
    public void testSwitchStorage() {
        DecimalQuantity_DualStorageBCD fq = new DecimalQuantity_DualStorageBCD();

        fq.setToLong(1234123412341234L);
        assertFalse("Should not be using byte array", fq.isUsingBytes());
        assertEquals("Failed on initialize", "1.234123412341234E+15", fq.toScientificString());
        assertNull("Failed health check", fq.checkHealth());
        // Long -> Bytes
        fq.appendDigit((byte) 5, 0, true);
        assertTrue("Should be using byte array", fq.isUsingBytes());
        assertEquals("Failed on multiply", "1.2341234123412345E+16", fq.toScientificString());
        assertNull("Failed health check", fq.checkHealth());
        // Bytes -> Long
        fq.roundToMagnitude(5, MATH_CONTEXT_HALF_EVEN);
        assertFalse("Should not be using byte array", fq.isUsingBytes());
        assertEquals("Failed on round", "1.23412341234E+16", fq.toScientificString());
        assertNull("Failed health check", fq.checkHealth());
        // Bytes with popFromLeft
        fq.setToBigDecimal(new BigDecimal("999999999999999999"));
        assertToStringAndHealth(fq, "<DecimalQuantity 0:0 bytes 999999999999999999E0>");
        fq.applyMaxInteger(17);
        assertToStringAndHealth(fq, "<DecimalQuantity 0:0 bytes 99999999999999999E0>");
        fq.applyMaxInteger(16);
        assertToStringAndHealth(fq, "<DecimalQuantity 0:0 long 9999999999999999E0>");
        fq.applyMaxInteger(15);
        assertToStringAndHealth(fq, "<DecimalQuantity 0:0 long 999999999999999E0>");
    }

    @Test
    public void testAppend() {
        DecimalQuantity_DualStorageBCD fq = new DecimalQuantity_DualStorageBCD();
        fq.appendDigit((byte) 1, 0, true);
        assertEquals("Failed on append", "1E+0", fq.toScientificString());
        assertNull("Failed health check", fq.checkHealth());
        fq.appendDigit((byte) 2, 0, true);
        assertEquals("Failed on append", "1.2E+1", fq.toScientificString());
        assertNull("Failed health check", fq.checkHealth());
        fq.appendDigit((byte) 3, 1, true);
        assertEquals("Failed on append", "1.203E+3", fq.toScientificString());
        assertNull("Failed health check", fq.checkHealth());
        fq.appendDigit((byte) 0, 1, true);
        assertEquals("Failed on append", "1.203E+5", fq.toScientificString());
        assertNull("Failed health check", fq.checkHealth());
        fq.appendDigit((byte) 4, 0, true);
        assertEquals("Failed on append", "1.203004E+6", fq.toScientificString());
        assertNull("Failed health check", fq.checkHealth());
        fq.appendDigit((byte) 0, 0, true);
        assertEquals("Failed on append", "1.203004E+7", fq.toScientificString());
        assertNull("Failed health check", fq.checkHealth());
        fq.appendDigit((byte) 5, 0, false);
        assertEquals("Failed on append", "1.20300405E+7", fq.toScientificString());
        assertNull("Failed health check", fq.checkHealth());
        fq.appendDigit((byte) 6, 0, false);
        assertEquals("Failed on append", "1.203004056E+7", fq.toScientificString());
        assertNull("Failed health check", fq.checkHealth());
        fq.appendDigit((byte) 7, 3, false);
        assertEquals("Failed on append", "1.2030040560007E+7", fq.toScientificString());
        assertNull("Failed health check", fq.checkHealth());
        StringBuilder baseExpected = new StringBuilder("1.2030040560007");
        for (int i = 0; i < 10; i++) {
            fq.appendDigit((byte) 8, 0, false);
            baseExpected.append('8');
            StringBuilder expected = new StringBuilder(baseExpected);
            expected.append("E+7");
            assertEquals("Failed on append", expected.toString(), fq.toScientificString());
            assertNull("Failed health check", fq.checkHealth());
        }
        fq.appendDigit((byte) 9, 2, false);
        baseExpected.append("009");
        StringBuilder expected = new StringBuilder(baseExpected);
        expected.append("E+7");
        assertEquals("Failed on append", expected.toString(), fq.toScientificString());
        assertNull("Failed health check", fq.checkHealth());
    }

    @Test
    public void testUseApproximateDoubleWhenAble() {
        Object[][] cases = {
                { 1.2345678, 1, MATH_CONTEXT_HALF_EVEN, false },
                { 1.2345678, 7, MATH_CONTEXT_HALF_EVEN, false },
                { 1.2345678, 12, MATH_CONTEXT_HALF_EVEN, false },
                { 1.2345678, 13, MATH_CONTEXT_HALF_EVEN, true },
                { 1.235, 1, MATH_CONTEXT_HALF_EVEN, false },
                { 1.235, 2, MATH_CONTEXT_HALF_EVEN, true },
                { 1.235, 3, MATH_CONTEXT_HALF_EVEN, false },
                { 1.000000000000001, 0, MATH_CONTEXT_HALF_EVEN, false },
                { 1.000000000000001, 0, MATH_CONTEXT_CEILING, true },
                { 1.235, 1, MATH_CONTEXT_CEILING, false },
                { 1.235, 2, MATH_CONTEXT_CEILING, false },
                { 1.235, 3, MATH_CONTEXT_CEILING, true } };

        for (Object[] cas : cases) {
            double d = (Double) cas[0];
            int maxFrac = (Integer) cas[1];
            MathContext mc = (MathContext) cas[2];
            boolean usesExact = (Boolean) cas[3];

            DecimalQuantity_DualStorageBCD fq = new DecimalQuantity_DualStorageBCD(d);
            assertTrue("Should be using approximate double", !fq.explicitExactDouble);
            fq.roundToMagnitude(-maxFrac, mc);
            assertEquals(
                    "Using approximate double after rounding: " + d + " maxFrac=" + maxFrac + " " + mc,
                    usesExact,
                    fq.explicitExactDouble);
        }
    }

    @Test
    public void testDecimalQuantityBehaviorStandalone() {
        DecimalQuantity_DualStorageBCD fq = new DecimalQuantity_DualStorageBCD();
        assertToStringAndHealth(fq, "<DecimalQuantity 0:0 long 0E0>");
        fq.setToInt(51423);
        assertToStringAndHealth(fq, "<DecimalQuantity 0:0 long 51423E0>");
        fq.adjustMagnitude(-3);
        assertToStringAndHealth(fq, "<DecimalQuantity 0:0 long 51423E-3>");
        fq.setToLong(90909090909000L);
        assertToStringAndHealth(fq, "<DecimalQuantity 0:0 long 90909090909E3>");
        fq.setMinInteger(2);
        fq.applyMaxInteger(5);
        assertToStringAndHealth(fq, "<DecimalQuantity 2:0 long 9E3>");
        fq.setMinFraction(3);
        assertToStringAndHealth(fq, "<DecimalQuantity 2:-3 long 9E3>");
        fq.setToDouble(987.654321);
        assertToStringAndHealth(fq, "<DecimalQuantity 2:-3 long 987654321E-6>");
        fq.roundToInfinity();
        assertToStringAndHealth(fq, "<DecimalQuantity 2:-3 long 987654321E-6>");
        fq.roundToIncrement(new BigDecimal("0.005"), MATH_CONTEXT_HALF_EVEN);
        assertToStringAndHealth(fq, "<DecimalQuantity 2:-3 long 987655E-3>");
        fq.roundToMagnitude(-2, MATH_CONTEXT_HALF_EVEN);
        assertToStringAndHealth(fq, "<DecimalQuantity 2:-3 long 98766E-2>");
    }

    @Test
    public void testFitsInLong() {
        DecimalQuantity_DualStorageBCD quantity = new DecimalQuantity_DualStorageBCD();
        quantity.setToInt(0);
        assertTrue("Zero should fit", quantity.fitsInLong());
        quantity.setToInt(42);
        assertTrue("Small int should fit", quantity.fitsInLong());
        quantity.setToDouble(0.1);
        assertFalse("Fraction should not fit", quantity.fitsInLong());
        quantity.setToDouble(42.1);
        assertFalse("Fraction should not fit", quantity.fitsInLong());
        quantity.setToLong(1000000);
        assertTrue("Large low-precision int should fit", quantity.fitsInLong());
        quantity.setToLong(1000000000000000000L);
        assertTrue("10^19 should fit", quantity.fitsInLong());
        quantity.setToLong(1234567890123456789L);
        assertTrue("A number between 10^19 and max long should fit", quantity.fitsInLong());
        quantity.setToLong(1234567890000000000L);
        assertTrue("A number with trailing zeros less than max long should fit", quantity.fitsInLong());
        quantity.setToLong(9223372026854775808L);
        assertTrue("A number less than max long but with similar digits should fit",
                quantity.fitsInLong());
        quantity.setToLong(9223372036854775806L);
        assertTrue("One less than max long should fit", quantity.fitsInLong());
        quantity.setToLong(9223372036854775807L);
        assertTrue("Max long should fit", quantity.fitsInLong());
        quantity.setToBigInteger(new BigInteger("9223372036854775808"));
        assertFalse("One greater than max long long should not fit", quantity.fitsInLong());
        quantity.setToBigInteger(new BigInteger("9223372046854775806"));
        assertFalse("A number between max long and 10^20 should not fit", quantity.fitsInLong());
        quantity.setToBigInteger(new BigInteger("9223372046800000000"));
        assertFalse("A large 10^19 number with trailing zeros should not fit", quantity.fitsInLong());
        quantity.setToBigInteger(new BigInteger("10000000000000000000"));
        assertFalse("10^20 should not fit", quantity.fitsInLong());
    }

    @Test
    public void testHardDoubleConversion() {
        // This test is somewhat duplicated from previous tests, but it is needed
        // for ICU4C compatibility.
        Object[][] cases = {
                { 512.0000000000017, "512.0000000000017" },
                { 4095.9999999999977, "4095.9999999999977" },
                { 4095.999999999998, "4095.999999999998" },
                { 4095.9999999999986, "4095.9999999999986" },
                { 4095.999999999999, "4095.999999999999" },
                { 4095.9999999999995, "4095.9999999999995" },
                { 4096.000000000001, "4096.000000000001" },
                { 4096.000000000002, "4096.000000000002" },
                { 4096.000000000003, "4096.000000000003" },
                { 4096.000000000004, "4096.000000000004" },
                { 4096.000000000005, "4096.000000000005" },
                { 4096.0000000000055, "4096.0000000000055" },
                { 4096.000000000006, "4096.000000000006" },
                { 4096.000000000007, "4096.000000000007" } };

        for (Object[] cas : cases) {
            double input = (Double) cas[0];
            String expectedOutput = (String) cas[1];

            DecimalQuantity q = new DecimalQuantity_DualStorageBCD(input);
            q.roundToInfinity();
            String actualOutput = q.toPlainString();
            assertEquals("", expectedOutput, actualOutput);
        }
    }

    @Test
    public void testToDouble() {
        Object[][] cases = new Object[][] {
            { "0", 0.0 },
            { "514.23", 514.23 },
            { "-3.142E-271", -3.142e-271 }
        };

        for (Object[] cas : cases) {
            String input = (String) cas[0];
            double expected = (Double) cas[1];

            DecimalQuantity q = new DecimalQuantity_DualStorageBCD();
            q.setToBigDecimal(new BigDecimal(input));
            double actual = q.toDouble();
            assertEquals("Doubles should exactly equal", expected, actual);
        }
    }

    @Test
    public void testMaxDigits() {
        DecimalQuantity_DualStorageBCD dq = new DecimalQuantity_DualStorageBCD(876.543);
        dq.roundToInfinity();
        dq.setMinInteger(0);
        dq.applyMaxInteger(2);
        dq.setMinFraction(0);
        dq.roundToMagnitude(-2, RoundingUtils.mathContextUnlimited(RoundingMode.FLOOR));
        assertEquals("Should trim, toPlainString", "76.54", dq.toPlainString());
        assertEquals("Should trim, toScientificString", "7.654E+1", dq.toScientificString());
        assertEquals("Should trim, toLong", 76, dq.toLong(true));
        assertEquals("Should trim, toFractionLong", 54, dq.toFractionLong(false));
        assertEquals("Should trim, toDouble", 76.54, dq.toDouble());
        assertEquals("Should trim, toBigDecimal", new BigDecimal("76.54"), dq.toBigDecimal());
    }

    @Test
    public void testNickelRounding() {
        Object[][] cases = new Object[][] {
            {1.000, -2, RoundingMode.HALF_EVEN, "1."},
            {1.001, -2, RoundingMode.HALF_EVEN, "1."},
            {1.010, -2, RoundingMode.HALF_EVEN, "1."},
            {1.020, -2, RoundingMode.HALF_EVEN, "1."},
            {1.024, -2, RoundingMode.HALF_EVEN, "1."},
            {1.025, -2, RoundingMode.HALF_EVEN, "1."},
            {1.025, -2, RoundingMode.HALF_DOWN, "1."},
            {1.025, -2, RoundingMode.HALF_UP,   "1.05"},
            {1.026, -2, RoundingMode.HALF_EVEN, "1.05"},
            {1.030, -2, RoundingMode.HALF_EVEN, "1.05"},
            {1.040, -2, RoundingMode.HALF_EVEN, "1.05"},
            {1.050, -2, RoundingMode.HALF_EVEN, "1.05"},
            {1.060, -2, RoundingMode.HALF_EVEN, "1.05"},
            {1.070, -2, RoundingMode.HALF_EVEN, "1.05"},
            {1.074, -2, RoundingMode.HALF_EVEN, "1.05"},
            {1.075, -2, RoundingMode.HALF_DOWN, "1.05"},
            {1.075, -2, RoundingMode.HALF_UP,   "1.1"},
            {1.075, -2, RoundingMode.HALF_EVEN, "1.1"},
            {1.076, -2, RoundingMode.HALF_EVEN, "1.1"},
            {1.080, -2, RoundingMode.HALF_EVEN, "1.1"},
            {1.090, -2, RoundingMode.HALF_EVEN, "1.1"},
            {1.099, -2, RoundingMode.HALF_EVEN, "1.1"},
            {1.999, -2, RoundingMode.HALF_EVEN, "2."},
            {2.25, -1, RoundingMode.HALF_EVEN, "2."},
            {2.25, -1, RoundingMode.HALF_UP,   "2.5"},
            {2.75, -1, RoundingMode.HALF_DOWN, "2.5"},
            {2.75, -1, RoundingMode.HALF_EVEN, "3."},
            {3.00, -1, RoundingMode.CEILING, "3."},
            {3.25, -1, RoundingMode.CEILING, "3.5"},
            {3.50, -1, RoundingMode.CEILING, "3.5"},
            {3.75, -1, RoundingMode.CEILING, "4."},
            {4.00, -1, RoundingMode.FLOOR, "4."},
            {4.25, -1, RoundingMode.FLOOR, "4."},
            {4.50, -1, RoundingMode.FLOOR, "4.5"},
            {4.75, -1, RoundingMode.FLOOR, "4.5"},
            {5.00, -1, RoundingMode.UP, "5."},
            {5.25, -1, RoundingMode.UP, "5.5"},
            {5.50, -1, RoundingMode.UP, "5.5"},
            {5.75, -1, RoundingMode.UP, "6."},
            {6.00, -1, RoundingMode.DOWN, "6."},
            {6.25, -1, RoundingMode.DOWN, "6."},
            {6.50, -1, RoundingMode.DOWN, "6.5"},
            {6.75, -1, RoundingMode.DOWN, "6.5"},
            {7.00, -1, RoundingMode.UNNECESSARY, "7."},
            {7.50, -1, RoundingMode.UNNECESSARY, "7.5"},
        };
        for (Object[] cas : cases) {
            double input = (Double) cas[0];
            int magnitude = (Integer) cas[1];
            RoundingMode roundingMode = (RoundingMode) cas[2];
            String expected = (String) cas[3];
            String message = input + " @ " + magnitude + " / " + roundingMode;
            for (int i=0; i<2; i++) {
                DecimalQuantity dq;
                if (i == 0) {
                    dq = new DecimalQuantity_DualStorageBCD(input);
                } else {
                    dq = new DecimalQuantity_SimpleStorage(input);
                }
                dq.roundToNickel(magnitude, RoundingUtils.mathContextUnlimited(roundingMode));
                String actual = dq.toPlainString();
                assertEquals(message, expected, actual);
            }
        }
        try {
            DecimalQuantity_DualStorageBCD dq = new DecimalQuantity_DualStorageBCD(7.1);
            dq.roundToNickel(-1, RoundingUtils.mathContextUnlimited(RoundingMode.UNNECESSARY));
            fail("Expected ArithmeticException");
        } catch (ArithmeticException expected) {
            // pass
        }
    }

    static void assertDoubleEquals(String message, double d1, double d2) {
        boolean equal = (Math.abs(d1 - d2) < 1e-6) || (Math.abs((d1 - d2) / d1) < 1e-6);
        handleAssert(equal, message, d1, d2, null, false);
    }

    static void assertBigDecimalEquals(String message, String d1, BigDecimal d2) {
        assertBigDecimalEquals(message, new BigDecimal(d1), d2);
    }

    static void assertBigDecimalEquals(String message, BigDecimal d1, BigDecimal d2) {
        boolean equal = d1.compareTo(d2) == 0;
        handleAssert(equal, message, d1, d2, null, false);
    }

    static void assertToStringAndHealth(DecimalQuantity_DualStorageBCD fq, String expected) {
        String actual = fq.toString();
        assertEquals("DecimalQuantity toString", expected, actual);
        String health = fq.checkHealth();
        assertNull("DecimalQuantity health", health);
    }
}
